package Facebook_01pkg.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfile extends FacebookBase {
	private By profileLink=By.linkText("Seth");
	private By addPicture=By.linkText("Add Photo");
	private By upLoadPic=By.className("_n _5f0v");

	public EditProfile(WebDriver driver) {
		super(driver);
	}
	//click on Profile link 
	public WebElement profile() {
		return getElement(profileLink);
	}
	//Click on Add Button on Profile picture
	public WebElement picture() {
		return getElement(addPicture);
	}
	//Click on Upload Picture
	public WebElement upload() {
		return getElement(upLoadPic);
	}

	public void seeProfile() throws InterruptedException {
		profile().click();
		picture().click();
		Thread.sleep(3000);
		upload().sendKeys("C:\\Users\\Subham\\Desktop");
		
	}
}
