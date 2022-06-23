package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;



public class RemoveAllItemsPage {

	WebDriver driver;
	
	//Elements List 
	
	@FindBy(css = "input[value='Remove']")WebElement REMOVEBUTTON;
	@FindBy(name = "category") WebElement CATEGORY;
	@FindBy(how = How.NAME, using = "allbox")
	public WebElement CHECKBOX;
	
	//Methods 
	
	public void clickToggleAll() { 
		
		CHECKBOX.click();
		
		//Assert.assertTrue("ToggleAll is not checked!",( CHECKBOX.isSelected()));
		
	}
	
	public void clickRemoveButton() { 
		
		REMOVEBUTTON.click();
		
		System.out.println("Remove Button is clicked.");
		
	}
	
	@SuppressWarnings("deprecation")
	public void validateRemovingAllItems() { 
		
		Select select = new Select(CATEGORY);
		List <String> actualValues = new ArrayList<String>();
		
		for(WebElement element:select.getOptions() ) { 
			actualValues.add(element.getText());	
		}
		System.out.println(actualValues);
		
		String expectedValue = null;
		
		Assert.assertEquals("Error in Remove Button Function", expectedValue, actualValues);
		
		
	}
	
	
	
	
	
	
}
