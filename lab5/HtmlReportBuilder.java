package lab5;

public class HtmlReportBuilder implements IReportBuilder {
    private Report report = new Report();
    public void setHeader(String h) { report.header = "<h1>" + h + "</h1>"; }
    public void setContent(String c) { report.content = "<div>" + c + "</div>"; }
    public void setFooter(String f) { report.footer = "<footer>" + f + "</footer>"; }
    public void addSection(String n, String c) { report.sections.add("<h2>" + n + "</h2><p>" + c + "</p>"); }
    public void setStyle(ReportStyle s) { report.style = s; }
    public Report getReport() { return report; }
}
