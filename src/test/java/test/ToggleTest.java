package test;

import java.awt.Checkbox;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TogglePage;
import util.BrowserFactory;

public class ToggleTest {

	WebDriver driver;
	@Test
	public void userShouldbeAbletoClickToggle() { 
		
		
		driver = BrowserFactory.init();
		
		
		TogglePage togglePage = PageFactory.initElements(driver, TogglePage.class);
		togglePage.clickToggleAll();
		togglePage.validateToggleAllBox();
		
		//Assertion
		Assert.assertTrue("ToggleAll is not checked!",( togglePage.CHECKBOX.isSelected()));
		
		BrowserFactory.tearDown();
		
		
		
		
		
	}
}
