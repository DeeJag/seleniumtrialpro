package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.TakesCoursePage;

public class TwitterPage extends BaseClass {
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_MINUS);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_MINUS);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_MINUS);
		
		s.searchtextbox(pdata.getData("courseName"));
		//s.searchButton();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		/*
		Point loc = s.getCrssel().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilities.scrollBar(driver, x, y);
		s.corejavaButton();
		*/
		
		SeleniumPage sp = new SeleniumPage(driver);
		driverutilities.switchtoFrame(driver);
		sp.corejava();
		
		TakesCoursePage tp = new TakesCoursePage(driver);
		driverutilities.switchtoFrame(driver);
		tp.playbutton();
		Thread.sleep(10000);
		tp.pausebutton();
		driverutilities.switchBack(driver);
		tp.twittericon();
	}

}
