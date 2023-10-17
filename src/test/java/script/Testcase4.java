package script;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.Baseclass;
import pomPages.contactUs;
import pomPages.skillraryDemoApp;
import pomPages.skillraryLoginPage;

public class Testcase4 extends Baseclass
{
	@Test
	public void tc3() throws IOException
	{
		skillraryLoginPage login=new skillraryLoginPage(driver);
		login.geartb();
		login.DemoApp();
		Point loc = login.getContactus().getLocation();
		int x = loc.x;
		int y = loc.y;
		login.getContactus();
		
		contactUs cs=new contactUs(driver);
		cs.name1(pdata.getPropertyData("fullname"));
		cs.email1(pdata.getPropertyData("email"));
		cs.subject1(pdata.getPropertyData("subject"));
		cs.message(pdata.getPropertyData("message"));
		cs.button();
		
	}
	

}
