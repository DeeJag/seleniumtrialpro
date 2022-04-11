package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public PropertyFile pdata = new PropertyFile();
	public WebDriver driver;
	public WebDriverUtilities driverutilities = new WebDriverUtilities();
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void openApp(String browser) throws FileNotFoundException, IOException {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status == 2) {
			Screenshot s = new Screenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}

}
