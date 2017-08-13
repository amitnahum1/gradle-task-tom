import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestFile {
	AppiumDriver driver;
	
	@Before
	public void setup() throws MalformedURLException{
    	DesiredCapabilities dc = new DesiredCapabilities();
    	dc.setCapability("user", "amit");
    	dc.setCapability("password", "Aa123456");
    	driver = new AndroidDriver(new URL("http://stage.experitest.com/wd/hub"),dc);
	}
	
	@Test
	public void test() {
		System.out.println(driver.getPageSource());
	}
	
	@After
	public void teardown(){
		driver.quit();
	}

}
