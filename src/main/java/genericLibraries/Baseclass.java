package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	
	public PropertyFile pdata=new PropertyFile();
	public WebdriverUtilites driverutilites=new WebdriverUtilites();
	
	
	@BeforeMethod
	public void OpenApp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseApp(ITestResult res) throws IOException {
	int status = res.getStatus();
	String name = res.getName();
	if(status==2)
	{
		Screenshot s= new Screenshot();
		s.getPhoto(driver, name);
	}
		driver.close();
	
}
}

