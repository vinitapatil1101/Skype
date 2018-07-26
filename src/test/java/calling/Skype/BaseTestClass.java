package calling.Skype;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import mobileBaseClasses.MobileBaseClass;
import mobileBaseClasses.MobileController;
import mobileLib.MobileConfigReader;
import mobileLib.MobileExcelDataConfig;
import pageObjects.DialerPage;
import pageObjects.DialerPageAndroid;
import pageObjects.DialerPageIOS;
import pageObjects.LoginPage;
import pageObjects.LoginPageAndroid;
import pageObjects.LoginPageIOS;


public class BaseTestClass extends MobileBaseClass{
	
	protected LoginPage loginPage;
	
	protected DialerPage dialerPage;

	@BeforeTest
	public void setUp() throws Exception {
		
		MobileController.instance.start();
		
		switch (MobileController.executionOS) {
       
		case ANDROID:
        	
        	loginPage = new LoginPageAndroid(driver());
        	
        	dialerPage = new DialerPageAndroid(driver());
       
        	break;
       
        case IOS:
        	
        	loginPage = new LoginPageIOS(driver());
           
            dialerPage = new DialerPageIOS(driver());
           
            break;

		}
	}
	/*@AfterTest
    public void tearDown() {
        MobileController.instance.stop();
    }*/
}
