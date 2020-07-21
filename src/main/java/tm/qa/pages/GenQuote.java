package tm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tm.qa.testbase.BaseClass;

public class GenQuote extends BaseClass {
	
@FindBy(name="user_name[]")
WebElement n_of_insured;
	
public 	GenQuote() {
PageFactory.initElements(driver, this);
}
	
 public void n_of_insureddata(String NOINSURED) {
 n_of_insured.sendKeys(NOINSURED);	
	
}
	

}
