package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrakLocators {
	public TimeTrakLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks")
	private WebElement tasksBtn;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settingsBtn;
	
	
	public WebElement getTasksBtn() {
		return tasksBtn;
	}
	public WebElement getSettingsBtn() {
		return settingsBtn;
	}
	
	public void clickonSettings() {
		getSettingsBtn().click();
	}
	
	public void clickonTasks() {
		getTasksBtn().click();
	}

}
