package neoStoxPOM;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew 
{
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//create object of Properties class
		Properties prop=new Properties();
		
		//create object of FileInputStream
		FileInputStream myfile=new FileInputStream("C:\\Users\\MIS\\eclipse-workspace\\23JUlMrng\\neoStox.Properties");
		
		prop.load(myfile);
		String value = prop.getProperty(key);
		Reporter.log("reading value of"+key+"from property file",true);
		return value;
	}
	public static void takesScreenshot(WebDriver driver,String filename) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\software\\Screenshot\\"+filename+".png");
		FileHandler.copy(src, dest);
		Reporter.log("taking screenshot",true);
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].ScrollIntoView(true)",element);
		Reporter.log("Scrolling into view"+element.getText(),true);
	}
	public static void wait(WebDriver driver,int waittime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for"+waittime+"milis",true);
		
	}
		
	

}
