package Facebook_01pkg.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookBase {
	protected WebDriver driver;
	public FacebookBase(WebDriver driver) {
		this.driver=driver;
		}
	
	public WebElement getElement(By locator) {
		WebElement elm=driver.findElement(locator);
		return elm;
		
	}
	

}
