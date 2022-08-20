package steps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeScreenSteps {
	
	public static AppiumDriver driver;
	
	
	@Before
	
	public void setUp() throws MalformedURLException  {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appium:platformName", "iOS");
		caps.setCapability("appium:deviceName", "iPhone 12 Pro Max");

		caps.setCapability("appium:automationName", "XCUITest");
		caps.setCapability("appium:udid", "9C78249E-B93A-4595-A4B9-EE95AE536F03");
	//	caps.setCapability("appium:app","/Users/mohammadhossain/Downloads/ios-uicatalog-master/UIKitCatalog/build/Release-iphonesimulator/UIKitCatalog-iphonesimulator.app");
	//	caps.setCapability("appium:app", "com.apple.mobileslideshow");
		caps.setCapability("appium:app","/Users/mohammadhossain/Downloads/ios-uicatalog-master/UIKitCatalog/build/Release-iphonesimulator/UIKitCatalog-iphonesimulator.app");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		 driver = new AppiumDriver(url, caps);
		
		
	}
	
	
	@Given("^I nevigate to UiCatalog home page$")
    public void i_nevigate_to_uicatalog_home_page() throws Throwable {
		
		String text =driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"UIKitCatalog\"`]")).getText();
		Assert.assertEquals("UIKitCatalog", text);
        
    }

	 @Then("^I click Alert views$")
	    public void i_click_alert_views() throws Throwable {
		 
	        driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Alert Views\"")).click();
	    }
	 @When("^I verify confim$")
	    public void i_verify_confim() throws Throwable {
	        
	    }

	   @And("^I click confirm and cancle$")
	    public void i_click_confirm_and_cancle() throws Throwable {
	        
	    }

	 
	   @After
	   public void  tearDown() {
		   driver.quit();
		   
	   }
	
	 
	  
}