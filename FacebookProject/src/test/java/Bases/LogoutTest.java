package Bases;


import org.testng.annotations.Test;

import Facebook_01pkg.FacebookProject.EditProfile;
import Facebook_01pkg.FacebookProject.FacebookHomePage;
import Facebook_01pkg.FacebookProject.FindFriends;

public class LogoutTest extends BasePage {

	@Test
	public void verifyLoginLogout() throws InterruptedException {
		FacebookHomePage hp=FbLPage.Login("seth54103@gamil.com","887766A!");
		System.out.println("Login successfull-------------");
		Thread.sleep(3000);	
		FindFriends ff=new FindFriends(driver);
		ff.FriendLink();
		driver.navigate().back();
		Thread.sleep(3000);
		EditProfile ep=new EditProfile(driver);
		ep.seeProfile();
		//hp.logout();
			}
		
	}
