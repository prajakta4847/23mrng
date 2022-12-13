package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeostoxHomePage
{
  @FindBy(xpath = "(//a[text()='OK'])[2]")private WebElement okButton;
  @FindBy(xpath = "(//a[text()='Close'])[5]")private WebElement closeButton;
  @FindBy(id = "lbl_username")private WebElement userName;
  @FindBy(id = "lbl_curbalancetop")private WebElement balance;
  @FindBy(xpath = "//span[text()='Logout']")private WebElement logoutButton;
  
  public NeostoxHomePage(WebDriver driver) 
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void popUpHandle(WebDriver driver)
  {
	  UtilityNew.wait(driver, 1000);
	  okButton.click();
	  UtilityNew.wait(driver, 1000);
	  closeButton.click();
	  Reporter.log("handling popUp",true);
  }
  
  public String getUserName() 
  {
	  String actualUserName=userName.getText();
	  Reporter.log("getting user name",true);
	  return actualUserName;
  }
  
  public String getBalance(WebDriver driver) 
  {
	  UtilityNew.wait(driver, 1000);
	  String actualBalance=balance.getText();
	  Reporter.log("getting actual balance",true);
	  return actualBalance;
  }
  
  public void logoutFormNewStox(WebDriver driver) 
  {
	  UtilityNew.wait(driver, 1000);
	  userName.click();
	 UtilityNew.wait(driver, 1000);
	  logoutButton.click();
	  Reporter.log("logging out from neostox",true);
  }
  }
  

