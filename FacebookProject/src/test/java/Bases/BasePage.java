package Bases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.google.common.base.Objects;

import Facebook_01pkg.FacebookProject.FacebookBase;
import Facebook_01pkg.FacebookProject.FacebookLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	protected WebDriver driver;
	FacebookBase fbPAge;
	FacebookLoginPage FbLPage;
	ChromeDriverService opt;
	@Test
	public void browserLaunch() {
		String browsername="chrome";
		//Create a Map to store preferences
		Map<String,Object> prefs=new HashMap<String,Object>();
		//add key and value to a map as follows to a switch off browser notifications
		//Pass Argument =1 to BLOCK and Argument=2 To ALLOW
		prefs.put("profile.default_content_setting_values.notifications",2);
		//Create an instance of chrome options
		ChromeOptions options=new ChromeOptions();
		//Set ExperimentalOption-prefs
		options.setExperimentalOption("prefs" ,prefs);
		if(browsername.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
	        driver= new ChromeDriver(options);
		}else if(browsername.equalsIgnoreCase("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}

		//Windows Maximize
		driver.manage().window().maximize();
		
		//Application Launch
		driver.get("https://www.facebook.com/");
	   fbPAge = new FacebookBase(driver);
	   FbLPage=new FacebookLoginPage(driver);
	   }

}
