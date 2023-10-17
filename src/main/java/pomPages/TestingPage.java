package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath ="//h1[text()='Testing ']")
	private WebElement testing;
	
	@FindBy(id="cartArea")
	private WebElement cart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;

	public WebElement getTesting() {
		return testing;
	}

	public WebElement getCart() {
		return cart;
	}
	
	public TestingPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
    }
	
	public void facebookicon()
	{
		facebook.click();
	}

	public WebElement getFacebook() {
		return facebook;
	}
}