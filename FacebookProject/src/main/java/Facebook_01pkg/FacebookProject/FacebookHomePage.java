package Facebook_01pkg.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookHomePage extends FacebookLoginPage {
	private By ArrowLink=By.id("logoutMenu");
	private By LogoutLink=By.xpath("//span[text()='Log Out']");
	

	public FacebookHomePage(WebDriver driver) {
		super(driver);
	}
	public WebElement getArrow() {
		return getElement(ArrowLink);
	}
	
    public WebElement getlogout() {
    	return getElement(LogoutLink);
	}
    
    public void logout() throws InterruptedException {
    	getArrow().click();
    	Thread.sleep(2000);
    	getlogout().click();
    	System.out.println("Logout Successfull--------------");
    	}
	}

