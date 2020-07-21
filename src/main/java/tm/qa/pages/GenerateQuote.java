package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tm.qa.testbase.BaseClass;
import tm.qa.utlis.Utils;

public class GenerateQuote extends BaseClass {
	
    @FindBy(xpath="//input[@name='first_date_of_cover' and @type='text']")
	WebElement FirstDateOfCover;

	@FindBy(name="last_date_of_cover")
    WebElement LastDateOfCover;

	@FindBy(name="Duration")
	WebElement duration;
	
////select[@class='form-control country_id']
	
	@FindBy(xpath="//div[@class='form-group']/descendant::select[@class='form-control country_id']")
	WebElement ClientCountry;
	
//	@FindBy(xpath="//select[@class='form-control country_id']")
//	WebElement ClientCountry;
//
	@FindBy(xpath="//div[@class='form-group']/descendant::select[@class='form-control province_id']")
	WebElement province;

	@FindBy(name="user_name[]")
	WebElement NameOfInsured;

	@FindBy(name="insured_gender[]")
	WebElement gender;

	@FindBy(name="dob_user[]")
	WebElement DateOfBirth;
	
	@FindBy(name="benificiary_name[]")
	WebElement beneficiaryName;
	
	@FindBy(name="benificiary_relation[]")
	WebElement benificiaryRelation;
		
	@FindBy(name="benificiary_dob[]")
	WebElement benificiaryDOB;
	
	@FindBy(name="arrival_date")
	WebElement arrivalDate;
		
	@FindBy(xpath="//input[@class='super_visa']")
	WebElement superVisa;
	
	@FindBy(xpath="//input[@class='family_coverage']")
	WebElement familyvisa;
	
	@FindBy(xpath="//div[@data-value='1'and @standard-discount='Base']")
	WebElement deduct0;
	
	@FindBy(xpath="//div[@data-value='2'and @standard-discount='5']")
	WebElement deduct100;
	
	@FindBy(xpath="//div[@data-value='3'and @standard-discount='10']")
	WebElement deduct250;
	
	@FindBy(xpath="//div[@data-value='4'and @standard-discount='15']")
	WebElement deduct500;
	
	@FindBy(xpath="//div[@data-value='5'and @standard-discount='20']")
	WebElement deduct1000;
	
	@FindBy(xpath="//div[@data-value='6'and @standard-discount='30']")
	WebElement deduct3000;

	
	@FindBy(xpath="//div[@data-value='25000' ]")
	WebElement PL25000;
	
	@FindBy(xpath="//div[@data-value='50000' ]")
	WebElement PL50000;
	
	@FindBy(xpath="//div[@class='radio text-center'and @data-value='100000']")
	WebElement PL100000;
	
	@FindBy(xpath="//div[@class='radio text-center'and @data-value='150000']")
	WebElement PL150000;
	
	@FindBy(xpath="//div[@class='radio text-center'and @data-value='300000']")
	WebElement PL300000;
	//div[@data-value='1'and @standard-discount='Base']
	
	@FindBy(xpath="//div[@data-value='1'and@max-age='89'  ]")
	WebElement standardpolicy;
	
	@FindBy(xpath="//div[@data-value='2'and @max-age='89']")
	WebElement enhancedpolicy;
	
	@FindBy(xpath="//div[@data-value='3'and@max-age='89'  ]")
	WebElement premiumpolicy;
	
//	@FindBy(xpath="")
//	WebElement
		
	public 	GenerateQuote() {
	PageFactory.initElements(driver, this);	
	}
		
	//actions

	public void validFLDOC(String FDOC,String LDOC,String CLIENT_COUNTRY,String PROVINCE,String N_O_INSURED,String GENDER,String 
		     DOB,String BEN_N,String RELATION,String BEN_DOB,String DEPARTURE_DATE,String VISATYPE,String DEDUCTABLE,
		     String POLICYLIMIT,String PLANTYPE) {
//		public void validFLDOC(String N_O_INSURED) {
	//FirstDateOfCover.clear();
    WebElement date=FirstDateOfCover;
    String datevalue=FDOC;
    Utils.selectDateByJS(driver, date, datevalue);
    
    //LastDateOfCover.clear();
    WebElement date1=LastDateOfCover;
    String datevalue1=LDOC;
    Utils.selectDateByJS(driver, date1, datevalue1);
    
    //ClientCountry.clear();
    Select select=new Select(ClientCountry);
    ClientCountry.click();
    select.selectByVisibleText(CLIENT_COUNTRY);
    
    Select select1=new Select(province);
    province.click();
   select1.selectByVisibleText(PROVINCE);
    
    NameOfInsured.clear();
	NameOfInsured.sendKeys(N_O_INSURED);
	
	
    Select select2=new Select(gender);
    gender.click();
    select2.selectByVisibleText(GENDER);
    
    WebElement date2=DateOfBirth;
    String datevalue2=DOB;
    Utils.selectDateByJS(driver, date2, datevalue2);
    
    beneficiaryName.clear();
    beneficiaryName.sendKeys(BEN_N);
    
    benificiaryRelation.clear();
    benificiaryRelation.sendKeys(RELATION);
    
   
    WebElement date3=benificiaryDOB;
    String datevalue3=BEN_DOB;
    Utils.selectDateByJS(driver, date3, datevalue3);
    
    WebElement date4=arrivalDate;
    String datevalue4=DEPARTURE_DATE;
    Utils.selectDateByJS(driver, date4, datevalue4);
    
 //Super Visa and family coverage
    	if(VISATYPE.equals("Super Visa")){
    	superVisa.click();
    	}
    	else if(VISATYPE.equals("Family Coverage")) {
    	familyvisa.click();
    	}
    	
    	//deductable
    	if(DEDUCTABLE.equals("$0")) {
    	deduct0.click();	
    	}
    	else if (DEDUCTABLE.equals("$100")) {
        	deduct100.click();	
        }
    	else if (DEDUCTABLE.equals("$250")) {
    	deduct250.click();	
    	}
    	else if (DEDUCTABLE.equals("$500")) {
        	deduct500.click();	
        	}
    	else if (DEDUCTABLE.equals("$1000")) {
        	deduct1000.click();	
        	}
    	else if (DEDUCTABLE.equals("$3000")) {
        	deduct3000.click();	
        	}
    	
 //ploicylimit
    	if(POLICYLIMIT.equals("$25000")) {
    	PL25000.click();	
    	}
    	else if(POLICYLIMIT.equals("$50000")) {
    	PL50000.click();	
    	}
    	else if(POLICYLIMIT.equals("$100000")){
    	PL100000.click();	
    	}
    	else if (POLICYLIMIT.equals("$150000")) {
    	PL150000.click();	
    	}
    	
 //plantype standardpolicy PLANTYPE enhancedpolicy premiumpolicy
    	if(PLANTYPE.equals("Standard")) {
    	standardpolicy.click();	
    	}
    	else if(PLANTYPE.equals("Enhanced")) {
    	enhancedpolicy.click();	
    	}
    	else if(PLANTYPE.equals("Premium")) {
    	premiumpolicy.click();	
    	}
////    	
   }}