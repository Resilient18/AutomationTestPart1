package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.RemoveButtonPage;
import util.BrowserFactory;
import org.junit.Assert;

public class RemoveButtonTest {

	
	WebDriver driver; 
	
	
	
	@Test
	public void userShouldbeAbleToRemoveItem( ) throws InterruptedException { 
		
		
		driver = BrowserFactory.init();
		RemoveButtonPage removeButtonPage = PageFactory.initElements(driver, RemoveButtonPage.class);
		
		removeButtonPage.clickToRemoveButton();
	
		BrowserFactory.tearDown();
		
	}
	
}
