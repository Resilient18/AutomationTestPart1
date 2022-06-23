package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NoDuplicatesPage {

	
	
	WebDriver driver; 
	
	//ElementList 
	@FindBy(how = How.NAME, using = "categorydata") WebElement ADDCATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADDBUTTON;
	@FindBy(linkText = "Raji'sTest2" ) WebElement CREATEDCATEGORY; 
	
	public void checkForDuplicates() { 
		if (CREATEDCATEGORY.isDisplayed()) { 
			System.out.println("The category you want to add alreadyexists:<duplicatedcategoryname>");
		//ADDCATEGORY.sendKeys("Raji'sTest2");
	//	ADDBUTTON.click();
		
		}
		
	}
}
