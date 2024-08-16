package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports {
	@Test
	public void createReport() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport.html");
		
		ExtentReports extReport=new ExtentReports();
		
		extReport.attachReporter(spark);
		
		ExtentTest test=extReport.createTest("createReport");
		
		test.log(Status.PASS,"Successfully created extent report");
		
		extReport.flush();
	}

}
