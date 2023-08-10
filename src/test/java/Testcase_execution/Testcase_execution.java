package Testcase_execution;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import LogIN.*;
import Utilities.*;
public class Testcase_execution {
	WebDriver wd = new FirefoxDriver();
	  static ExtentTest test2;//Interface
	  static ExtentReports rep2;//class
	  
	  // Page objects
	  CommonMethods a = new CommonMethods();
	  TS_LF_001 a1 = new TS_LF_001();
	  TS_LF_002 b1 = new TS_LF_002();
	  TS_LF_003 c1 = new TS_LF_003();
	  TC_LF_004 d1 = new TC_LF_004();
	  TC_LF_005 e1 = new TC_LF_005();

	  @BeforeTest
	  public void pre_condition() {
		a.Maximize_window();
		a.Delete_coockies_from_browser();
		rep2 = new ExtentReports(System.getProperty("user.dir")+"./Reports/Report1.html");
		test2=rep2.startTest("bmwscript1");    //testNGclass
		  //We are using it here because it is a one Time Task
		  //wd=new FirefoxDriver();
		  
	  }
 
	  @Test(priority=1)
	  public void f1() throws IOException, InterruptedException 
	  {
		    a1.TC001();
		    test2.log(LogStatus.PASS,"Testcase executed succesfully");

			 

	  }
	  
	  @Test(enabled=false)
	  public void f2() throws IOException, InterruptedException 
	  {
		    b1.TC002();
		    test2.log(LogStatus.PASS,"Testcase executed succesfully");


	  } 
	  @Test(enabled=false)
	  public void f3() throws IOException, InterruptedException 
	  {
		    c1.TC003();
		    test2.log(LogStatus.PASS,"Testcase executed succesfully");

			 

	  } 
	  @Test(enabled=false)
	  public void f4() throws IOException, InterruptedException 
	  {
		    d1.TC004();
		    test2.log(LogStatus.PASS,"Testcase executed succesfully");

			 

	  }
	  
	  @Test(enabled=false)
	  public void f5() throws IOException, InterruptedException 
	  {
		    e1.TC005();
		    test2.log(LogStatus.PASS,"Testcase executed succesfully");
		    rep2.endTest(test2); 
		    rep2.flush(); 
		  	rep2.close();
			 

	  }
	
}
