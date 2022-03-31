package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class FacebookPage extends BaseClass {
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd = new SkillraryDemoApp(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropDown(sd.getTestingdd(), pdata.getData("dropdownValue"));
		
		TestingPage t = new TestingPage(driver);
		driverutilities.dragDrop(driver, t.getSeleniumcourse(), t.getCart());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollBar(driver, x, y);
		t.facebookicon();
	}

}
