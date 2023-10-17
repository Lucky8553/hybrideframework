package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUs {
	
	@FindBy(name = "name")
	private WebElement fullnametb;
	
	@FindBy(name = "sender")
	private WebElement emailtb;
	
	@FindBy(name = "subject")
	private WebElement subjecttb;
	
	@FindBy(name = "message")
	private WebElement messagetb;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement sendusbtn;
	
	public contactUs(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void name1(String fullname)
	{
		fullnametb.sendKeys(fullname);
	}
	
	public void email1(String email)
	{
		emailtb.sendKeys(email);
	}
	public void subject1(String subject)
	{
		subjecttb.sendKeys(subject);
	}
	public void message(String message)
	{
		messagetb.sendKeys(message);
	}
	public void button()
	{
		sendusbtn.click();
	}
	
	
	

}
