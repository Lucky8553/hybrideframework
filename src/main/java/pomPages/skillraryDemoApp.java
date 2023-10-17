package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryDemoApp {
	
	@FindBy(xpath="//button[@class='dropbtn']")
	private WebElement coursbtn;
	
	@FindBy(xpath="(//a[text()='shadab'])[1]")
	private WebElement sha;
	
    @FindBy(xpath="//select[@class='chosen-select']")
	private WebElement dropdown;
     

	@FindBy(xpath="//a[text()='LOGIN']")
    private WebElement loginbtn;
    
	
	
	public WebElement getDropdown() {
		return dropdown;
	}

	public skillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void coursbtn()
	{
		coursbtn.click();
	}
	
	public WebElement getCoursbtn() {
		return coursbtn;
	}

	public void setCoursbtn(WebElement coursbtn) {
		this.coursbtn = coursbtn;
	}

	public WebElement getSha() {
		return sha;
	}

	public void shaba()
	{
		sha.click();
	}
	public void loginbtn()
	{
		loginbtn.click();
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
