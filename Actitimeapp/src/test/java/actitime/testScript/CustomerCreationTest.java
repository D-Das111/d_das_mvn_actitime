package actitime.testScript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import actitime.elementRepository.TasksLocators;
import actitime.elementRepository.TimeTrakLocators;
import actitime.genericLib.BaseClass;

@Listeners(actitime.genericLib.ListenerImplementation.class)
public class CustomerCreationTest extends BaseClass {
//	@Parameters("customerName")
//	@Test
//	public void tasks(String customerName) throws EncryptedDocumentException, IOException {
//		driver.findElement(By.id("container_tasks")).click();
//		driver.findElement(By.cssSelector(".title.ellipsis")).click();
//		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
//
//		String cusName =customerName; 
//		int num = cu.getRAndomNum();
//		cusName = cusName + num;
//		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']"))
//				.sendKeys(cusName);
//		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("245");
//		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
//		By locator=By.xpath("//div[@class='titleEditButtonContainer']");
//		cu.explicitWaitTextToBePresentInElementLocated(driver, 10, locator, cusName);
//		String res = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
//		//System.out.println(res);
//		Reporter.log(res, true);
//	}

//	@Test
//	public void tasks() throws EncryptedDocumentException, IOException {
//		driver.findElement(By.id("container_tasks")).click();
//		driver.findElement(By.cssSelector(".title.ellipsis")).click();
//		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
//
//		String cusName =du.getDataFromExcel("Sheet1", 0, 1);
//		int num = cu.getRAndomNum();
//		cusName = cusName + num;
//		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']"))
//				.sendKeys(cusName);
//		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(cusName+" is ready to create");
//		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
//		By locator=By.xpath("//div[@class='titleEditButtonContainer']");
//		cu.explicitWaitTextToBePresentInElementLocated(driver, 10, locator, cusName);
//		String res = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
//		//System.out.println(res);
//		Reporter.log(res, true);
//	}

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String cusName = du.getDataFromExcel("Sheet1", 0, 1);
		int num = cu.getRAndomNum();
		cusName = cusName + num;
		TimeTrakLocators ttl = new TimeTrakLocators(driver);
		ttl.clickonTasks();
		TasksLocators tl = new TasksLocators(driver);
		By loc = tl.customerCreate(cusName, cusName + " is ready to create");
		// Thread.sleep(2000);
		cu.explicitWaitTextToBePresentInElementLocated(driver, 10, loc, cusName);
		String res = driver.findElement(loc).getText();
		//String res = tl.getTitleeditBtncontainerText().getText();
		// System.out.println(res);
		Reporter.log(res, true);

	}
}
