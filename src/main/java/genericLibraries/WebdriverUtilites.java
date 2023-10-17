 package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilites {
	public WebDriver driver;
	
	public void dropdown(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver, WebElement ele )
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragadndrop(WebDriver driver, WebElement target, WebElement source)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchback(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void alertpopups(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchingTabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
			for(String b:child)
			{
				driver.switchTo().window(b);
			}
		}
	
			
	 public void scrollBar(WebDriver driver, int x,int y)
	 {
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("Window.scrollBy("+x+","+y+")");
	 }
		
	}

