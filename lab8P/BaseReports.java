package lab8P;

class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Данные отчета по продажам: [Товар: Ноутбук, Сумма: 500000 KZT, Дата: 2026-03-15]";
    }
}

class UserReport implements IReport {
    @Override
    public String generate() {
        return "Данные отчета по пользователям: [ID: 1, Имя: Timur, Статус: Active]";
    }
}