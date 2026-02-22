package lab5;

import java.io.*;
import java.nio.file.*;
import java.util.Properties;

public final class Logger {
    private static volatile Logger instance;
    private LogLevel currentLevel = LogLevel.INFO;
    private String logFilePath = "app.log";

    private Logger() { loadConfig(); }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) instance = new Logger();
            }
        }
        return instance;
    }

    private void loadConfig() {
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            this.currentLevel = LogLevel.valueOf(prop.getProperty("log.level", "INFO"));
            this.logFilePath = prop.getProperty("log.file", "app.log");
        } catch (Exception e) { System.out.println("Конфиг не найден, используем дефолт."); }
    }

    public synchronized void log(String message, LogLevel level) {
        if (level.ordinal() >= currentLevel.ordinal()) {
            String entry = "[" + level + "] " + message;
            try (FileWriter fw = new FileWriter(logFilePath, true);
                 PrintWriter pw = new PrintWriter(fw)) {
                pw.println(entry);
                System.out.println("Записано: " + entry);
            } catch (IOException e) { e.printStackTrace(); }
        }
    }

    public void setLogLevel(LogLevel level) { this.currentLevel = level; }
}
