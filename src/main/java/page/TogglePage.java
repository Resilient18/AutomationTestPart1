package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TogglePage extends BasePage {
	
	
	WebDriver driver; 
	
	public TogglePage(WebDriver driver) { 
		this.driver = driver;
	}
	
	//Element List 
	
	@FindBy(how = How.NAME, using = "allbox")
	public WebElement CHECKBOX;
	@FindBy(linkText = "Kwintas671") WebElement Kwintas671BUTTON;
	@FindBy(linkText ="Yes") WebElement YESBUTTON;
	@FindBy(how = How.NAME, using = "data") WebElement ADDCATEGORY;
	@FindBy(how = How.NAME,using = "due_month") WebElement MONTH;
	
	
	
	//Intractable Methods 
	
	public void clickToggleAll() { 
		
		CHECKBOX.click();
		
	}
	
	public void validateToggleAllBox() { 
		if (CHECKBOX.isSelected()) { 
			
			System.out.println("TOGGLE ALL IS SELECTED.");
		}	
		
		
	}
	
	public void removeButton() { 
		Kwintas671BUTTON.click();
		
	}
	
	
}

	

