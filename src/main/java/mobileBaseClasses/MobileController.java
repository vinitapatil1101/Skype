package mobileBaseClasses;
/**
 * @author Vinita Patil
 */
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import mobileBaseClasses.MobileController;
import mobileBaseClasses.MobileController.OS;

public class MobileController {
	public static OS executionOS = OS.ANDROID;
	public enum OS {   
        ANDROID,
        IOS
    }
	public static MobileController instance = new MobileController();
    public AppiumDriver<MobileElement> driver;
  
    public static String userName = "vinitapatil1";
 	public static String accessKey = "rEfGxExg83Sy6cvqxdyS";
  
 	public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        switch(executionOS){
        case ANDROID:
        	
        	DesiredCapabilities capabilities = new DesiredCapabilities();

        	//capabilities.setCapability("device", "Google Pixel");
        	// capabilities.setCapability("os_version", "7.1");
     	   // capabilities.setCapability("app", "bs://521f626ee62e13e8c81711e6aef0c38b319b0093");
     	    
     	  //  AndroidDriver driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
        	        	
          //  File classpathRoot = new File(System.getProperty("user.dir"));
          //  File appDir = new File(classpathRoot, "/app/Android");
          //  File app = new File (appDir, "Voice_Everywhere_0.0.0.2103.apk");
         
        	capabilities.setCapability("automationName", "uiautomator2");
         
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Android device");
          //  capabilities.setCapability("app", app.getAbsolutePath());    
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.skype.m2");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.skype.m2.views.AppEntry");
        
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4727/wd/hub"), capabilities);
          
            break;
        case IOS:
        	//classpathRoot = new File(System.getProperty("user.dir"));
           // appDir = new File(classpathRoot, "/app/iOS/");
           // app = new File(appDir, "ContactsSimulator.app");
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "ios");
            capabilities.setCapability("deviceName", "=iPhone 5s");
          //  capabilities.setCapability("app", app.getAbsolutePath());
          //  driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            break;
    }
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}

/*public void stop() {
    if (driver != null) {
        driver.quit();
        driver = null;
    }
} */
}
