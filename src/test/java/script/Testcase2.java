package script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.Baseclass;
import pomPages.TestingPage;
import pomPages.skillraryDemoApp;
import pomPages.skillraryLoginPage;

public class Testcase2 extends Baseclass {

	@Test
	public void tc2() throws IOException
	{
		skillraryLoginPage lg=new skillraryLoginPage(driver);
		lg.geartb();
		lg.DemoApp();
		
		skillraryDemoApp sd=new skillraryDemoApp(driver);
		driverutilites.switchingTabs(driver);
		driverutilites.dropdown(sd.getDropdown(), pdata.getPropertyData("course"));
		
		TestingPage ts=new TestingPage(driver);
		driverutilites.dragadndrop(driver,ts.getTesting(),ts.getCart());
		Point loc = ts.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilites.scrollBar(driver, x, y);
		ts.facebookicon();
	}
	
}
