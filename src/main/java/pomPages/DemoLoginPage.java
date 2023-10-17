package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DemoLoginPage {

	@FindBy(name="email")
	private WebElement usernametb;	

	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="last")
	private WebElement loginbtn;

	public DemoLoginPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void email(String username)
	{
		usernametb.sendKeys(username);
	}
	public void password(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
	}

}
