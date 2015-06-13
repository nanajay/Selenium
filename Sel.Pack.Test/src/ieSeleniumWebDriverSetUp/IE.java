package ieSeleniumWebDriverSetUp;

import java.io.File;

import myConstant.MyCons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class IE
{
	public WebDriver ieSetUp()
	{
		 File ieDriverLocation = new File ("C:\\Selenium File\\web driver\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",ieDriverLocation.getAbsolutePath());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("ignoreZoomSetting", true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get(MyCons.testlink);
		driver.close();
		return driver;	
	}
	


}
