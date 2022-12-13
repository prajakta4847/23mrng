package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxPOM.UtilityNew;




public class Base 
{
	protected WebDriver driver;
	public void launchBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(UtilityNew.readDataFromPropertyFile("url"));
		driver.manage().window().maximize();
		Reporter.log("launchingBrowser",true);
		UtilityNew.wait(driver, 1000);
	}
	
	public static void closingBrowser(WebDriver driver) throws InterruptedException 
	{
		Reporter.log("closing browser",true);
		Thread.sleep(1000);
		driver.close();
	}

}
