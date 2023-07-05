package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutLocators {
	public LogoutLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;

	public WebElement getLogoutBTN() {
		return logoutBTN;
	}
	
	public void logoutApp() {
		getLogoutBTN().click();
	}

}
