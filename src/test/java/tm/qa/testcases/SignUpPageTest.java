package tm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import tm.qa.pages.HomePage;
import tm.qa.pages.SignUpPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class SignUpPageTest extends BaseClass {
 SignUpPage signup;
 HomePage home;
 String sheetname1="signupdata";
 String sheetname2="validsignupdata";

 public SignUpPageTest(){
  super();	                          //to initialize the properties from base class
  }
  @BeforeMethod()
  public void setup() {
  initialization();
  home=new HomePage();
  signup=new SignUpPage();
  home.ClickOnBecomeAnAgent();
  }
  @DataProvider
  public Object[][] getTestedData(){
  Object data[][] = Utils.getTestData(sheetname1);
  return data;
  }
  @Test(enabled=false, dataProvider="getTestedData")
  public void invalidtestdata(String FirstName,String LastName,String Email,String Password,String confirmPassword){
  signup.validdata(FirstName, LastName, Email, Password, confirmPassword);
  Assert.assertEquals("Surbhi", FirstName);
  Assert.assertEquals("Gupta", LastName);
  Assert.assertEquals("invalid email", "Surbhi@gmail.com", Email);
  Assert.assertEquals("$Urb!5", Password);
  Assert.assertEquals(Password, confirmPassword);
  }
  
  @DataProvider
  public Object[][] gettesteddata2(){
  Object data1[][]=Utils.getTestData(sheetname2);
  return data1;
  }
  @Test(priority=1,dataProvider="gettesteddata2")
  public void validtestdata(String FirstName,String LastName,String Email,String Password,String confirmPassword) {
  signup.validdata(FirstName, LastName, Email, Password, confirmPassword);
  Assert.assertEquals("Surbhi", FirstName);
  Assert.assertEquals("Gupta", LastName);
  Assert.assertEquals("valid email", "wqqweqwr@gmail.com", Email);
  Assert.assertEquals("$Urb!5", Password);
  Assert.assertEquals(Password, confirmPassword);
  Assert.assertTrue("CheckUrl", driver.getCurrentUrl().equals("https://www.travelmedicare.com/user_profile"));
  }
  
  @AfterMethod()
  public void teardown(){
  //driver.quit();
  }

}








