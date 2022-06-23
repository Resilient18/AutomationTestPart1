package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;
import util.BrowserFactory;

public class AddItemPage {
	
	WebDriver driver; 
	
	
	//Element List 
	
	@FindBy(how = How.NAME, using = "categorydata") WebElement ADDCATEGORY;
	@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADDBUTTON;
	@FindBy(linkText = "Raji'sTest2"  )
	public WebElement ADDEDCATEGORY;
	
	//Intractable Methods
	
	
	public void addItemToList() { 
		
		
		ADDCATEGORY.sendKeys("Raji'sTest2");
		ADDBUTTON.click();
		
		
	}

}
