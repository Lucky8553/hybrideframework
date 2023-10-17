package script;

import org.testng.annotations.Test;

import genericLibraries.Baseclass;
import pomPages.skillrarayAddtocart;
import pomPages.skillraryDemoApp;
import pomPages.skillraryLoginPage;

public class Testcase1 extends Baseclass {
	
	@Test
	public void tc1()
	{
		
		skillraryLoginPage lg=new skillraryLoginPage(driver);
		lg.geartb();
		lg.DemoApp();
		
		skillraryDemoApp sd=new skillraryDemoApp(driver);
		driverutilites.switchingTabs(driver);
		driverutilites.mousehover(driver, sd.getCoursbtn());
		sd.shaba();
		
		skillrarayAddtocart ad=new skillrarayAddtocart(driver);
		driverutilites.doubleclick(driver, ad.getAddbtn());
		ad.cart();
		driverutilites.alertpopups(driver);
		

}
}
