package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemo;
	
	@FindBy(name="q")
	private WebElement searchtb;

	//@FindBy(xpath="//input[@value='go']")
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	

	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchtextbox(String coursename) {
		searchtb.sendKeys(coursename);
	}

	public void searchButton() {
		searchbtn.click();
	}
	
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapp() {
		skillrarydemo.click();
	}

}
