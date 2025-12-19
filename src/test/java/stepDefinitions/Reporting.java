package stepDefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

    public static void generateJVMReport(String jsonFile) {

        File reportOutputDir = new File("target");  

        String projectName = "OMR GT";

        Configuration configuration = new Configuration(reportOutputDir, projectName);

        configuration.addClassifications("OS", "WIN 11");
        configuration.addClassifications("BrowserName", "Chrome");
        configuration.addClassifications("Version", "144");
        configuration.addClassifications("Sprint", "35");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonFile);
        ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

        builder.generateReports(); 
    }
}
