package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.NoDuplicatesPage;
import util.BrowserFactory;

public class NoDuplicatesTest {
	
	
	WebDriver driver; 
	
	@Test
	public void userShouldNotBeAbleToAddDuplicates() { 
		
		
		
		driver = BrowserFactory.init();
		
		NoDuplicatesPage noDuplicatesPage = PageFactory.initElements(driver, NoDuplicatesPage.class );
		noDuplicatesPage.checkForDuplicates();
		
		
		
	}
	

}
