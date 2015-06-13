package chromeSeleniumWedDriverSetUp;

import java.io.File;

import myConstant.MyCons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeSelSetUp 
{
	public void chromeSetU()
	{
		 File chromeLocation = new File ("C:\\Selenium File\\web driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",chromeLocation.getAbsolutePath());
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get(MyCons.testlink);
		driver.close();
	}
}
