import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
	       File appDir = new File("src");
	       File app = new File(appDir, "ApiDemos-debug.apk");

	   	AndroidDriver<AndroidElement>  driver;
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel2");
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			
			return driver;
	}

}


//Additional comments

//cap.setCapability("appPackage", "io.appium.android.apis");
//cap.setCapability("appActivity",  "io.appium.android.apis.ApiDemos");
//driver.pressKeyCode(AndroidKeyCode.HOME);