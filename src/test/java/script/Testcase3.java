package script;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.Baseclass;
import pomPages.DemoLoginPage;
import pomPages.skillraryDemoApp;
import pomPages.skillraryLoginPage;

public class Testcase3 extends Baseclass {
	
	@Test
	public void tc3() throws IOException
	{
		skillraryLoginPage lg=new skillraryLoginPage(driver);
		lg.geartb();
		lg.DemoApp();
		
		skillraryDemoApp sd=new skillraryDemoApp(driver);
		driverutilites.switchingTabs(driver);
		sd.getLoginbtn();
		
		DemoLoginPage dp=new DemoLoginPage(driver);
		dp.email(pdata.getPropertyData("username"));
		dp.password(pdata.getPropertyData("passcode"));
		dp.loginbutton();
	}

}
