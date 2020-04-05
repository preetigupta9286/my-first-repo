package tm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tm.qa.pages.HomePage;
import tm.qa.pages.SignUpPage;
import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class HomePageTestCase extends BaseClass
{

  public static HomePage home;
  public static Utils util;
  public static SignUpPage signup;
  
  public HomePageTestCase() {                //constructor, for the properties from base class{ 
  super();                              //to call super class
  }
                                            //all the properties will be define then it will call initialization method 
  //precondition
  @BeforeMethod
  public void setup() {
  initialization();
  home=new HomePage();
  }
  
//  testcases
   @Test(priority=1)
   public static void HomeLink(){
   String	actual=  home.validHomeBtn();
   Assert.assertEquals(actual, "https://www.travelmedicare.com/");
   System.out.println("The current url is="+actual);
   }
     
   @Test(priority=2)
   public static void signin(){
   home.validMyTMbtn();
   }

   @Test(priority=3)
   public static void signup() {
   home.ClickOnBecomeAnAgent();
   }
   
   @Test(priority=4)
   public static void logoTest(){
   home.validLogo();
   }
  	     
   @Test(priority=5)
   public static void getAQuote()   {
   home.ValidGetAQuotebtn();
   }
   
   @Test(priority=6)
   public static void insurancePlan(){
   boolean actual=home.validInsurancePlanbtn();
   Assert.assertEquals(actual, true);
   }
  	      
   @Test(priority=7)
   public static void superVisaVsingle(){
   boolean actual= home.validSuperVisaVSSinglebtn();
   Assert.assertEquals(actual, true);
   }
  	      
   @Test(priority=8)
   public static void bottomgetAQuote() {
   boolean actual=home.validBottomGetAQuote();
   Assert.assertEquals(actual, true);
   }
  	      
   @Test(priority=9)
   public static void AboutUsLink() {
   boolean actual=home.AboutUsBtn();
   Assert.assertEquals(actual, true);
   }
  	      
   @Test(priority=10)
   public static void PrivacyAndPolicyLink(){
   boolean actual=home.PrivacyPolicyBtn();
   Assert.assertEquals(actual, true);
   }
  	     
   @Test(priority=11)
   public static void TermsAndCondiLink(){
   boolean actual=home.TermsAndCondBtn();
   Assert.assertEquals(actual, true);
   }
  	      
   @Test(priority=12)
   public static void EmailsLink() {
   boolean actual=home.EmailLink();
   Assert.assertEquals(actual, true);
   }
  	      
 //postcondion
   @AfterMethod
   public void teardown(){
   driver.quit();
   }   

}
