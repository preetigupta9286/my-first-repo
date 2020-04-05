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
	 String sheetname1="FirstNameWithValidData";
	 String sheetname2="Firstnamewithinvaliddata";


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
  @Test(priority=2, dataProvider="getTestedData")
  public void validtestdata(String Firstname,String LastName,String Email,String Password,String ConPassword){
  signup.validdata(Firstname, LastName, Email, Password, ConPassword);
  }
  
  @DataProvider
  public Object[][] getTestData2(){
  Object data1[][] = Utils.getTestData(sheetname2);
  return data1;
  }
	@Test(priority=1, dataProvider="getTestData2")
	public void invalidtestdata(String Firstname,String LastName,String Email,String Password,String ConPassword){
		  signup.validdata(Firstname, LastName, Email, Password, ConPassword);
		Assert.fail("invalid data");
	}
	
  	
           

@AfterMethod()
public void teardown()
{
	driver.quit();
}

}








