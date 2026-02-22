package lab5;

public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                Logger.getInstance().log("Поток работает", LogLevel.INFO);
            }).start();
        }

        HtmlReportBuilder builder = new HtmlReportBuilder();
        builder.setHeader("Проверка");
        builder.addSection("Данные", "Пример контента");
        builder.setStyle(new ReportStyle("White", "Black", 12));
        builder.getReport().export();

        Character hero = new Character();
        hero.name = "Воин";
        hero.weapon = new Weapon("Меч", 50);
        hero.skills.add("Удар");

        Character enemy = hero.clone();
        enemy.name = "Орк";
        enemy.weapon.damage = 100; // У героя урон останется 50 (глубокое клонирование)

        System.out.println(hero.name + " урон: " + hero.weapon.damage);
        System.out.println(enemy.name + " урон: " + enemy.weapon.damage);
    }
}