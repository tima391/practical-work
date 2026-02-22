package lab5;

public interface IReportBuilder {
    void setHeader(String h);
    void setContent(String c);
    void setFooter(String f);
    void addSection(String name, String content);
    void setStyle(ReportStyle style);
    Report getReport();
}
