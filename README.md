# Selenium
# switch window codes
ReadingDataFromExcel readData = new ReadingDataFromExcel();
	
	@SuppressWarnings("unused")
	public void logIn(WebDriver driver)
	{
		// Store the current window handle
	    String winHandleBefore = driver.getWindowHandle();
	    System.out.println(driver.getTitle());
	    System.out.println(winHandleBefore);
	    
		driver.findElement(By.id("Textid_86D14005_C2BB_CDC4_B372_38FF318CF349")).sendKeys(readData.getUserName());
		driver.findElement(By.id("Passwordid_09831B8F_3771_6436_B161_FD766AC32320")).sendKeys(readData.getPassword());
		driver.findElement(By.id("Imageid_31EFA2AA_718C_848A_77A0_EC996BADEA84")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		// Switch to new window opened
				for(String winHandle : driver.getWindowHandles()){
				    driver.switchTo().window(winHandle);
				    System.out.println(driver.getTitle());
				    System.out.println(winHandle);
				}
				
				
				// Perform the actions on new window
				driver.findElement(By.id("Linkid_70559A45_3EB9_D564_8579_CCFD30CFA055")).click();
				//http://rsjbossuatwe01:8180/quote/
	}
	
	#capture screenshot codes
	public void captureScreen(String fileName) throws Exception
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "png", new File(fileName+".png"));
	}
	
	#reading input test data code4s
	package eQuotes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;






public class ReadingDataFromExcel 
{
	private String broswerName;
	private String username;
	private String password;
	private String policyRef;
	
	public void readData(List<String> policyList, String sheetName)
	{
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(MyConstants.TEST_DATA_FILE_LOCATION);
			// Access the required test data sheet
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetName);
			// Loop through all rows in the sheet
			// Start at row 1 as row 0 is our header row
			for(int count = 1;count<=sheet.getLastRowNum();count++){
				XSSFRow row = sheet.getRow(count);
				if(sheet.getSheetName().equalsIgnoreCase(MyConstants.BROWSERNAME_TEST_DATA_SHEET_NAME))
				{
					broswerName = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getBrowserName());
					// Adding the browser name to the list
					policyList.add(getBrowserName());
				}
				
				else if(sheet.getSheetName().equalsIgnoreCase(MyConstants.AGENCY_TEST_DAT_SHEET_NAME))
				{
					policyRef = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getPolicyRef());
					// Adding the browser name to the list
					policyList.add(getPolicyRef());
				}
				else if(sheet.getSheetName().equalsIgnoreCase(MyConstants.ANNUITY_TEST_DAT_SHEET_NAME))
				{
					policyRef = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getPolicyRef());
					// Adding the browser name to the list
					policyList.add(getPolicyRef());
				}
				else if(sheet.getSheetName().equalsIgnoreCase(MyConstants.AQUITYRELEASE_TEST_DAT_SHEET_NAME))
				{
					policyRef = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getPolicyRef());
					// Adding the browser name to the list
					policyList.add(getPolicyRef());
				}
				else if(sheet.getSheetName().equalsIgnoreCase(MyConstants.PENSIONS_TEST_DAT_SHEET_NAME))
				{
					policyRef = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getPolicyRef());
					// Adding the browser name to the list
					policyList.add(getPolicyRef());
				}
				else if(sheet.getSheetName().equalsIgnoreCase(MyConstants.SASS_TEST_DAT_SHEET_NAME))
				{
					policyRef = row.getCell(0).toString();
					System.out.println("Reading from " + sheetName + " Sheet : " + getPolicyRef());
					// Adding the browser name to the list
					policyList.add(getPolicyRef());
				}
			}
			wb.close();
			fis.close();
		} 
			catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	
	public String getUserName()
	{
		
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(MyConstants.TEST_DATA_FILE_LOCATION);
			// Access the required test data sheet

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(MyConstants.LOGON_DETAILS_TEST_DAT_SHEET_NAME);
			// Loop through all rows in the sheet
			// Start at row 1 as row 0 is our header row
			for(int count = 1;count<=sheet.getLastRowNum();count++){
				XSSFRow row = sheet.getRow(count);
				System.out.println("Running test case " + row.getCell(0).toString());
				// Run the test for the current test data row
				 username = row.getCell(0).toString();
			}
			fis.close();
		} 
		catch (IOException e)
		{
			System.out.println("Test data file not found");
		}
		return username;   
	}
	
	public String getPassword()
	{
		try {
			// Open the Excel file
			FileInputStream fis = new FileInputStream(MyConstants.TEST_DATA_FILE_LOCATION);
			// Access the required test data sheet

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(MyConstants.LOGON_DETAILS_TEST_DAT_SHEET_NAME);
			// Loop through all rows in the sheet
			// Start at row 1 as row 0 is our header row
			for(int count = 1;count<=sheet.getLastRowNum();count++){
				XSSFRow row = sheet.getRow(count);
				System.out.println("Running test case " + row.getCell(0).toString());
				// Run the test for the current test data row
				password = row.getCell(1).toString();
			}
			fis.close();
		} 
		catch (IOException e)
		{
			System.out.println("Test data file not found");
		}
		return password;   
	}
	
	
	private String getBrowserName()
	{
		return this.broswerName;
	}
	
	private String getPolicyRef()
	{
		return this.policyRef;
	}

}

#chrome driver set up
package workdesk;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import workdesk.constants.MyConstants;

public class ChromeSeleniumDriverSetup
{
	public WebDriver chromeSetUp()
	{
		File fChromeDriver = new File("S:\\Projects\\LV= UAT\\Selenium Files\\wed server\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", fChromeDriver.getAbsolutePath());
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		WebDriver chDriver = new ChromeDriver(capabilities);
		chDriver.get(MyConstants.TEST_LINK);
		chDriver.manage().window().maximize();
		//chDriver.close();
		return chDriver;
		
		

	}
	
	
}

#IE dripackage workdesk;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import workdesk.constants.MyConstants;

public class IEWebDriverSeleniumSetUp
{
		
	public WebDriver setUpIE()
	{
		File IEDriver = new File("S:\\Projects\\LV= UAT\\Selenium Files\\wed server\\IE\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath() );   
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
		WebDriver driver = new InternetExplorerDriver(capabilities);
		driver.get(MyConstants.TEST_LINK);
		driver.manage().window().maximize();
		return driver;
	}
}


	
