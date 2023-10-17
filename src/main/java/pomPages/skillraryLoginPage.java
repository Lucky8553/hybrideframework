package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement geartb;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement demoapp;
	
	@FindBy(xpath = "//a[text()=' Contact Us '] ")
	private WebElement contactus;
	
	
	public  skillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void geartb()
	{
		geartb.click();
	}
	public void DemoApp()
	{
		demoapp.click();
	}
	
	public void contactus()
	{
		contactus.click();
	}

	public WebElement getContactus() {
		return contactus;
	}
	

}
