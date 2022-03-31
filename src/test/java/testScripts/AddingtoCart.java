package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class AddingtoCart extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtraining();
		
		AddtoCart a = new AddtoCart(driver);
		driverutilities.doubleClick(driver, a.getAdd());
		a.addtocartbtn();
		driverutilities.alertPopup(driver);
	}

}
