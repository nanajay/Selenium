package safariSelWebDriver;

import myConstant.MyCons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SarafiSelSetUp
{

	public void safariSetUp()
	{
		WebDriver driver = new SafariDriver();
		driver.get(MyCons.testlink);
	}
}
