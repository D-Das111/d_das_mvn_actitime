package actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.elementRepository.SettingLocators;
import actitime.elementRepository.TimeTrakLocators;
import actitime.elementRepository.TpesofWorksLocators;
import actitime.genericLib.BaseClass;

@Listeners(actitime.genericLib.ListenerImplementation.class)
public class AlertHandlingTest extends BaseClass {

//	@Test
//	public void alertHandle() throws EncryptedDocumentException, IOException {
//		//  driver.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
//		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
//		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
//		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
//		driver.findElement(By.id("name")).sendKeys(du.getDataFromExcel("Sheet2", 0, 1) + cu.getRAndomNum());
//		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[@type='button']")).click();
//		String msg = cu.alertMsg(driver);
////		System.out.println(msg);
//		Reporter.log(msg, true);
//		cu.alertDismis(driver);
//		
//		String expected="Are you sure you want to cancel the Type of Work creation?";
//		Assert.assertEquals(expected, msg);
//	}

	@Test
	public void alertHandle() throws EncryptedDocumentException, IOException {

		TpesofWorksLocators tl = new TpesofWorksLocators(driver);
		SettingLocators sl = new SettingLocators(driver);
		TimeTrakLocators ttl = new TimeTrakLocators(driver);

		ttl.clickonSettings();
		sl.clickTypesofWork();
		tl.createTypeofWork(du.getDataFromExcel("Sheet2", 0, 1) + cu.getRAndomNum());
		
		String msg = cu.alertMsg(driver);
//		System.out.println(msg);
		Reporter.log(msg, true);
		cu.alertDismis(driver);

		String expected = "Are you sure you want to cancel the Type of Work creation?";
		Assert.assertEquals(expected, msg);
	}
}
