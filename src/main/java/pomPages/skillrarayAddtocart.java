package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillrarayAddtocart {
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement cart;
	
	public skillrarayAddtocart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cart()
	{
		cart.click();
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public void setAddbtn(WebElement addbtn) {
		this.addbtn = addbtn;
	}

}
