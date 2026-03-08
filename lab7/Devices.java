package lab7;

class Light {
    public void on() { System.out.println("Свет включен"); }
    public void off() { System.out.println("Свет выключен"); }
}

class AirConditioner {
    public void on() { System.out.println("Кондиционер включен"); }
    public void off() { System.out.println("Кондиционер выключен"); }
    public void setTemperature(int t) { System.out.println("Температура кондиционера: " + t + "°C"); }
}

class MusicPlayer {
    public void play() { System.out.println("Музыка начала играть"); }
    public void stop() { System.out.println("Музыка остановлена"); }
}