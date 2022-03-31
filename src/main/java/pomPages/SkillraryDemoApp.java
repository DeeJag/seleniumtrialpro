package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement selenium;
	
	

	public WebElement getTestingdd() {
		return testingdd;
	}

	@FindBy(name="addresstype")
	private WebElement testingdd;
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumtraining() {
		selenium.click();
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public WebElement getSelenium() {
		return selenium;
	}

}
