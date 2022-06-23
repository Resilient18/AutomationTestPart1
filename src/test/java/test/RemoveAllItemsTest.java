package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItemsPage;
import util.BrowserFactory;


public class RemoveAllItemsTest {
	
 WebDriver driver; 
 
 @Test
 public void userShouldbeAbleToRemoveAllItems() {
	 
	 
	 driver = BrowserFactory.init();
	 
	 RemoveAllItemsPage removeAllItemsPage = PageFactory.initElements(driver, RemoveAllItemsPage.class);
	 removeAllItemsPage.clickToggleAll();
	 removeAllItemsPage.clickRemoveButton();
	 removeAllItemsPage.validateRemovingAllItems();
 }
}
