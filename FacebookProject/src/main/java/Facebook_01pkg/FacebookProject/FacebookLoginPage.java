package Facebook_01pkg.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends FacebookBase {
	private By Email=By.id("email");
	private By Password=By.id("pass");
	private By LoginBtn=By.id("loginbutton");

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
	}
		
		public WebElement getEmail() {
			return getElement(Email);
		}
		public WebElement getLoginPass() {
			return getElement(Password);
		}
		public WebElement getLoginBtn() {
			return getElement(LoginBtn);
		}
		
		public FacebookHomePage Login(String Email,String Password) {
			getEmail().sendKeys(Email);
			getLoginPass().sendKeys(Password);
			getLoginBtn().click();
			return new FacebookHomePage(driver)  ;
			}
}
