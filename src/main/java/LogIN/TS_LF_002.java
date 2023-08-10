package LogIN;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;

public class TS_LF_002
{


public void TC002() throws IOException, InterruptedException 
	{
	WebDriver wd = new FirefoxDriver();

		FileReader fr = new FileReader("./TestData/testdata.properties");
		Properties p=new Properties();
		// Loading properties file to access
		p.load(fr);
		wd.get(p.getProperty("baseurl"));
		if(wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/h2")).isDisplayed()) {
			System.out.println(" page invoked successfully");
			File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src,new File("./Screenshots/LaunchApp1.png"));
		}
		else {
			System.out.println("Please check the url");
		}

		//Avoid providing static test data
		// keep the  test data in properties file
		Thread.sleep(2000);
		wd.findElement(By.name("email")).clear();
		wd.findElement(By.name("email")).sendKeys(p.getProperty("unm2"));
		Thread.sleep(2000);
		wd.findElement(By.name("password")).clear();
		wd.findElement(By.name("password")).sendKeys(p.getProperty("pwd2"));
		Thread.sleep(2000);
		//click on login button
		wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		Thread.sleep(2000);
		String Expect = "Warning: No match for E-Mail Address and/or Password.";
		String Actual=wd.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
		if(Actual.equalsIgnoreCase(Expect)) {
			System.out.println("The allert message is correct" + " " +Actual );
			File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			Files.copy(src,new File("./Screenshots/wrong_uname&PWD.png"));
		}
		else {
			System.out.println("error nessage is wrong");
		}
	
		}
	
}
