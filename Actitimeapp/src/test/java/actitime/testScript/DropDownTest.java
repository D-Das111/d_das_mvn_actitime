package actitime.testScript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import actitime.elementRepository.GeneralSettingsLocators;
import actitime.elementRepository.SettingLocators;
import actitime.elementRepository.TimeTrakLocators;
import actitime.genericLib.BaseClass;
@Listeners(actitime.genericLib.ListenerImplementation.class)
public class DropDownTest extends BaseClass {
//	@Test(groups= {"smoke", "system"})
//	public void generalSettings()
//	{
//		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings ']")).click();
//		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
//		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
//		cu.dropdownbyVisibleText(dropdown, "Product Line");
//		String text=driver.findElement(By.id("FormModifiedTextCell")).getText();
////		System.out.println(text);
//		Reporter.log(text, true);
//		String actual="MODIFICATIONS NOT SAVED";
//		SoftAssert ast=new SoftAssert();
//		ast.assertEquals(actual, text);
//		ast.assertAll();
//	}
	
	@Test
	public void generalSettings()
	{
		GeneralSettingsLocators gs=new GeneralSettingsLocators(driver);
		SettingLocators sl=new SettingLocators(driver);
		TimeTrakLocators tl=new TimeTrakLocators(driver);
		
		tl.clickonSettings();
		sl.clickGeneralSetting();
		cu.dropdownbyVisibleText(gs.getTopgroupinglevelDdown(), "Product Line");
		Reporter.log(gs.getModificationnotSavedTxt(), true);
		String actual="MODIFICATIONS NOT SAVED";
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(actual, gs.getModificationnotSavedTxt());
		ast.assertAll();
	}
 
}
