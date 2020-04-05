package tm.qa.pages;

import org.openqa.selenium.By;
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

	@FindBy(xpath="//div[@class='form-group']/descendant::select[@class='form-control country_id']")
	WebElement ClientCountry;

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
		
	
	//@FindBy()
	//WebElement
		//
	
	//@FindBy()
	//WebElement
		//
		
		
	public 	GenerateQuote() {
	PageFactory.initElements(driver, this);	
	}
		
	//actions

	public void validFLDOC() {

    
    
    WebElement date=FirstDateOfCover;
    String datevalue="2020-04-18";
    Utils.selectDateByJS(driver, date, datevalue);
    
    WebElement date1=LastDateOfCover;
    String datevalue1="2020-04-30";
    Utils.selectDateByJS(driver, date1, datevalue1);
    
    Select select=new Select(ClientCountry);
    ClientCountry.click();
    select.selectByVisibleText("Canada");
    
    
    Select select1=new Select(province);
    province.click();
    select1.selectByVisibleText("Ontario");
    
    NameOfInsured.sendKeys("Nitika");
    
    Select select2=new Select(gender);
    gender.click();
    select2.selectByVisibleText("Female");
    
    WebElement date2=DateOfBirth;
    String datevalue2="1992-04-15";
    Utils.selectDateByJS(driver, date2, datevalue2);
    
    beneficiaryName.sendKeys("ocean");
    benificiaryRelation.sendKeys("Father");
     
    WebElement date3= benificiaryDOB;
    String datevalue3="1958-04-15";
    Utils.selectDateByJS(driver, date3, datevalue3);
    
     WebElement date4= arrivalDate;
    String datevalue4="2020-04-03";
    Utils.selectDateByJS(driver, date4, datevalue4);
    
    
//    String Gender=prop.getProperty("gender");
//    if(Gender.equals("male")) {
//		Select select2=new Select(driver.findElement(By.name("insured_gender[]")));
//		select2.selectByVisibleText("gender");
//	}
//	else if(Gender.equals("female")) {
//	Select select3=new Select(driver.findElement(By.name("insured_gender")));
//	select3.selectByVisibleText("female");
//	}
//    
//    
//	}
//    public void validLDOC() {
//    WebElement date=LastDateOfCover;
//    String datevalue="30-04-2020";
//    Utils.selectDateByJS(driver, date, datevalue);
   

}}