package firefoxSeleniumWebDriverSetUp;

import java.net.MalformedURLException;
import java.net.URL;

import myConstant.MyCons;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxSelSetUp
{
	private static RemoteWebDriver driver;
	
	public WebDriver firefoxSetUp() throws MalformedURLException
	{
		
		
		  DesiredCapabilities capability = DesiredCapabilities.firefox();
	        capability.setBrowserName("firefox");
	        capability.setPlatform(Platform.WINDOWS);
	        capability.setVersion("3.6");
	        driver = new RemoteWebDriver(new URL("http://localhost:4444"), capability);
	        driver.get(MyCons.testlink);
	       // driver.close();
			return driver;
	}
}
