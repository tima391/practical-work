package lab5;

import java.util.*;

public class Report {
    public String header, content, footer;
    public List<String> sections = new ArrayList<>();
    public ReportStyle style;

    public void export() {
        System.out.println("--- Экспорт отчета ---");
        System.out.println("Стиль: " + (style != null ? style.bgColor : "Default"));
        System.out.println(header + "\n" + content);
        sections.forEach(s -> System.out.println("Секция: " + s));
        System.out.println(footer + "\n--------------------");
    }
}
