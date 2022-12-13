package neoStoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOM.NeostoxHomePage;
import neoStoxPOM.NeostoxPasswordPage;
import neoStoxPOM.NeostoxSignLogin;
import neoStoxPOM.UtilityNew;



public class ValidateNeostoxUserName extends Base{
	
	NeostoxSignLogin login;
	NeostoxPasswordPage password;
	NeostoxHomePage home;
	@BeforeClass
	public void launchNeostox() throws IOException 
	{
		launchBrowser();
		login=new NeostoxSignLogin(driver);
		password=new NeostoxPasswordPage(driver);
		home=new NeostoxHomePage(driver);
	}	
		@BeforeMethod
	public void loginToNeostox() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		login.sendmobNumfield(driver,UtilityNew.readDataFromPropertyFile("mobNum"));
		login.clickOnSignInButton(driver);
		Thread.sleep(8000);
		password.sendpassword(driver,UtilityNew.readDataFromPropertyFile("pass"));
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.popUpHandle(driver);
		
	}
	
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException 
  
  {
	   Assert.assertEquals(home.getUserName(),UtilityNew.readDataFromPropertyFile("userName"));
	   UtilityNew.takesScreenshot(driver, home.getUserName());
	  
  }
  
  @AfterMethod
  public void logout() 
  {
	  home.logoutFormNewStox(driver);
  }
  
  @AfterClass
  public void closeApplication() throws InterruptedException
  {
	 closingBrowser(driver);
  }
  
}
