package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.AddItemPage;
import util.BrowserFactory;

public class AddItemTest {
	
	WebDriver driver;
	
@Test	
public void userShouldBeAbletoAddItem() { 
		
		
		driver = BrowserFactory.init();
		
		AddItemPage addItemPage = PageFactory.initElements(driver, AddItemPage.class);
		
		addItemPage.addItemToList();
		//Assert.assertFalse(null, false);
		Assert.assertTrue("Item not found", addItemPage.ADDEDCATEGORY.isDisplayed());
		
	}

}
