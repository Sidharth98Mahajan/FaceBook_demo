package Facebook_01pkg.FacebookProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindFriends extends FacebookLoginPage{
	private By friends=By.linkText("Find Friends"); 
	private By searchFriend=By.name("q"); 
	private By searchBtn=By.className("_585_");
	

	public FindFriends(WebDriver driver) {
		super(driver);
	}
	//To click on Friends Button 
	public WebElement getFriendsLink() {
		return getElement(friends);
	}
	//To Search a friend
	public WebElement getSearchingFriend() {
		return getElement(searchFriend);
	}
	//To click on Search Button
	public WebElement Search() {
		return getElement(searchBtn);
	}
	
    public void FriendLink() throws InterruptedException {
	getFriendsLink().click();
	getSearchingFriend().sendKeys("Rahul");
	Thread.sleep(5000);
	Search().click();
	driver.navigate().back();
	System.out.println("Friend Search successfull---------");
	
	}
}
