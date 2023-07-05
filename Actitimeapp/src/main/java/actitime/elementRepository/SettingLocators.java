package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SettingLocators {
	public SettingLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	private WebElement turnFeatureonoff;
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']")
	private WebElement generalSettings;
	private WebElement workFlowSetting;
	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement typesofWork;
	private WebElement leaveTypes;
	private WebElement notifications;
	private WebElement logoSettings;

	public WebElement getGeneralSettings() {
		return generalSettings;
	}

	public WebElement getTypesofWork() {
		return typesofWork;
	}
	
	public void clickGeneralSetting()
	{
		getGeneralSettings().click();
	}
	public void clickTypesofWork()
	{
		getTypesofWork().click();
	}
	

}
