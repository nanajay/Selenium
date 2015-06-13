package operaSeleniumWebDriverSetUp;

import java.io.File;

import myConstant.MyCons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OperaSelSetUp
{
	public WebDriver operaSetUp()
	{
		 File operaLocation = new File ("C:\\Selenium File\\web driver\\operadriver.exe");
			System.setProperty("webdriver.opera.driver",operaLocation.getAbsolutePath());
			DesiredCapabilities capabilities = DesiredCapabilities.opera();
			capabilities.setBrowserName("opera");
			capabilities.setCapability("opera.binary", "C:\\Program Files\\Opera x64");
		WebDriver driver = new OperaDriver();
		driver.get(MyCons.testlink);
		driver.close();
		return driver;
	}

}
