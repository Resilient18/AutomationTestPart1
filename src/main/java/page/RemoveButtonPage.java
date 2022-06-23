package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveButtonPage {
	
	WebDriver driver;
	
	public void removeButtonPage(WebDriver driver) { 
		this.driver = driver;
		
	}
	
	
	//Elements List 
	@FindBy(linkText = "Kwintas408")
	public WebElement BUTTON;
	//@FindBy(linkText ="Yes") WebElement YESBUTTON;
	@FindBy(how=How.XPATH, using = "//a[text()='Yes']") WebElement YESBUTTON;
	
	public void clickToRemoveButton() { 
		
		BUTTON.click();
		System.out.println("Button is clicked");
		
		YESBUTTON.click();
		 System.out.println("Item is removed.");
	}
	
	
	
  
   
   
   
}

