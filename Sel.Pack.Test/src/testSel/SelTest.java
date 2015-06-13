package testSel;

import java.net.MalformedURLException;

import operaSeleniumWebDriverSetUp.OperaSelSetUp;

import org.testng.annotations.Test;

import safariSelWebDriver.SarafiSelSetUp;

import chromeSeleniumWedDriverSetUp.ChromeSelSetUp;

import ieSeleniumWebDriverSetUp.IE;
import firefoxSeleniumWebDriverSetUp.FirefoxSelSetUp;


public class SelTest 
{

	IE internetEx = new IE();
	FirefoxSelSetUp fi = new FirefoxSelSetUp();
	OperaSelSetUp oper = new OperaSelSetUp();
	ChromeSelSetUp chr = new ChromeSelSetUp();
	SarafiSelSetUp saf = new SarafiSelSetUp();
	
	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	@Test
	public void runTest() throws MalformedURLException
	{
		// TODO Auto-generated method stub
		
		SelTest MyObjeect = new SelTest();
		//MyObjeect.testIE();
		//MyObjeect.testChrome();
		//MyObjeect.testIE();
		MyObjeect.testFireFox();
		//MyObjeect.testOpera();
		//MyObjeect.testSafari();

	}
	
	private void testFireFox() throws MalformedURLException
	{
		fi.firefoxSetUp();
		
	}
	
	private void testIE()
	{
		internetEx.ieSetUp();
	}
	
	private void testOpera()
	{
		oper.operaSetUp();
	}
	
	public void testChrome()
	{
		chr.chromeSetU();
	}

	public void testSafari()
	{
		saf.safariSetUp();
	}

}
