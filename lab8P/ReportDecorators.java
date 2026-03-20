package lab8P;

abstract class ReportDecorator implements IReport {
    protected IReport report;
    public ReportDecorator(IReport report) { this.report = report; }
    @Override
    public String generate() { return report.generate(); }
}

class DateFilterDecorator extends ReportDecorator {
    public DateFilterDecorator(IReport report) { super(report); }
    @Override
    public String generate() { return super.generate() + " | Фильтр: 01.03 - 17.03"; }
}

class SortingDecorator extends ReportDecorator {
    public SortingDecorator(IReport report) { super(report); }
    @Override
    public String generate() { return super.generate() + " | Сортировка: по дате"; }
}

class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) { super(report); }
    @Override
    public String generate() { return "CSV_FORMAT >> " + super.generate(); }
}
