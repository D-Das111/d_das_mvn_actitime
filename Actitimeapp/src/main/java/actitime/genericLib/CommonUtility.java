package actitime.genericLib;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
// Random Number
	public int getRAndomNum() {
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}

	
	// Alert Handling
	public void alertAccepct(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void alertDismis(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public String alertMsg(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		return msg;
	}

	public void alertSendKeys(WebDriver driver, String data) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(data);
	}
	
	
	// Dropdown Handling
	public void dropdownbyVisibleText(WebElement dropdown, String VisibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(VisibleText);
	}
	public void dropdownbyIndex(WebElement dropdown, int index)
	{
		Select s=new Select(dropdown);
		s.selectByIndex(index);
	}
	public void dropdownbyValue(WebElement dropdown, String value)
	{
		Select s=new Select(dropdown);
		s.selectByValue(value);
	}
	public List<WebElement> dropdownAllOptions(WebElement dropdown)
	{
		Select s=new Select(dropdown);
		return s.getOptions();
	}

	
	// Explicit Wait
	public void explicitWaitTitleContains(WebDriver driver, long sec, String visibleTest) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.titleContains(visibleTest));
	}

	public void explicitWaitNumberOfWindowsToBe(WebDriver driver, long sec, int noOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));
	}

	public void explicitWaitTextToBePresentInElementLocated(WebDriver driver, long sec, By locator, String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, name));
	}
	
	//Mouse Handling
	public void moveToElement(WebDriver driver, WebElement wb)
	{
		Actions act= new Actions(driver);
		act.moveToElement(wb).perform();
	}
	public void doubleClick(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.doubleClick().build().perform();
	}
	public void doubleClick(WebDriver driver, WebElement wb)
	{
		Actions act= new Actions(driver);
		act.doubleClick(wb).perform();
	}
	public void rightClick(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.contextClick().build().perform();
	}
	public void rightClick(WebDriver driver, WebElement wb)
	{
		Actions act= new Actions(driver);
		act.contextClick(wb).perform();
	}
	
}
