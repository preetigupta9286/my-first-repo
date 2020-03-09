package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.testbase.BaseClass;

public class HomePage extends BaseClass
{            
	   //page factory or object repository
@FindBy(xpath="//a[contains(text(),' Home ')]")
WebElement homebtn;		
			
@FindBy(xpath="//a[contains(text(),'My TM')]")
WebElement clickOnMyTm;

@FindBy(xpath="//a[contains(text(),'Become an Agent')]")
WebElement clickOnBecomeAnAgent;

@FindBy(xpath="//img[@alt='logo']")
WebElement clickOnLogo;

@FindBy(xpath="//a[@class='ti-arrow-right']")
WebElement clickOnGetAQuote;

@FindBy(xpath="//h3[contains(text(),' Insurance Plan')]")
WebElement ClickOnInsurancePlan;

@FindBy(xpath="//h3[contains(text(),'Super Visa vs. Single Trip Plan')]")
WebElement clickOnSuperVisaVSSingle;

@FindBy(xpath="//a[@class='btn-default ti-arrow-right']")
WebElement clickOnBottomGetAQuote;

@FindBy(xpath="//a[contains(text(),'About Us')]")
WebElement AboutUsbtn;

@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
WebElement privacypolbtn;

@FindBy(xpath="//a[contains(text(),'Terms & Condition')]")
WebElement termscondionsbtn;

@FindBy(xpath="//a[contains(text(),'info@travelmedicare.com')]")
WebElement clickOnEmail;



   //Constructor
  public HomePage()      
   {
	PageFactory.initElements(driver, this);
   }
              
  
  //actions
            public HomePage validHomeBtn()
             {
	       homebtn.click();
	       return  new HomePage();
             }
            
            
           public  SignInPage validMyTMbtn()
             {
	         clickOnMyTm.click();
	         return new SignInPage();
	        }
           
       
          public SignUpPage ClickOnBecomeAnAgent()
          {
    	   clickOnBecomeAnAgent.click();; 
    	   return new SignUpPage();
          }
          
          
         public HomePage validLogo()
             {
	         clickOnLogo.isEnabled();
	        return  new HomePage();
	        }
         
         
         public HomePage ValidGetAQuotebtn()
              {   
    	    clickOnGetAQuote.click();
    	    return new HomePage();
    	    }
         
         
       public boolean validInsurancePlanbtn()
             {
        	return ClickOnInsurancePlan.isEnabled();
             }
       
       
       public boolean validSuperVisaVSSinglebtn()
             {
        	return clickOnSuperVisaVSSingle.isEnabled();
             }
       
       
       public boolean validBottomGetAQuote()
             {
        	return clickOnBottomGetAQuote.isEnabled();
        	 }
       
       
       public boolean AboutUsBtn()
       {
    	  return AboutUsbtn.isEnabled();  
       }
       
       
       public boolean PrivacyPolicyBtn()
       {
    	  return privacypolbtn.isEnabled();
       }
       
       
       public boolean TermsAndCondBtn()
       {
      return termscondionsbtn.isEnabled();
      }
       
       
       public boolean EmailLink()
       {
    	   return clickOnEmail.isEnabled();
       }
	
	
	
	
}
