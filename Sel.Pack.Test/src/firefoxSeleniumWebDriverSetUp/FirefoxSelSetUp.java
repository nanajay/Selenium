package firefoxSeleniumWebDriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSelSetUp
{
	public WebDriver firefoxSetUp()
	{
		WebDriver driver = new FirefoxDriver();
		driver.close();
		return driver;
	}
}
