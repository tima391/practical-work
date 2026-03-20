package lab8P;

public class DecoratorDemo {
    public static void main(String[] args) {
        IReport myReport = new SalesReport();
        myReport = new DateFilterDecorator(myReport);
        myReport = new SortingDecorator(myReport);
        myReport = new CsvExportDecorator(myReport);

        System.out.println(myReport.generate());
    }
}