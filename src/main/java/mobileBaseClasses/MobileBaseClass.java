package mobileBaseClasses;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
/**
 * @author Vinita Patil
 */
public abstract class MobileBaseClass {
	
	
	protected AppiumDriver<MobileElement> driver() {
        return MobileController.instance.driver;
    }
	
	/*public  AndroidDriver<MobileElement> driver;
  @BeforeClass
  public void LaunchApp() throws MalformedURLException, InterruptedException 
  {*/
	 // MobileConfigReader config = new MobileConfigReader();
	  /** For Emulator	   */
	/*File appDir= new File("src");
	File app=new File(appDir,"Mobility_Anywhere_0.0.0.1604.apk");
	  
	DesiredCapabilities capabilities = new DesiredCapabilities();   
	capabilities.setCapability("automationName", "uiautomator2");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
	
	capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.cox.mobilityanywhere.main.login.LoginActivity");
	capabilities.setCapability("app", config.AppPath());
		
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);		
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
		
		/** For Real Device  */
		// File appDir= new File("src");
		// File app=new File(appDir,"Mobility_Anywhere_0.0.0.1604.apk");
		  
		/* DesiredCapabilities capabilities = new DesiredCapabilities();   
		 capabilities.setCapability("automationName", "uiautomator2");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		// capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.cox.mobilityanywhere.main.login.LoginActivity");
		 capabilities.setCapability("app", config.AppPath());
			
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
 // }
}
