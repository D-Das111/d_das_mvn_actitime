package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	public LoginLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name="pwd")
	private WebElement passwordTB;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginApp(String username, String password) {
		getUsernameTB().sendKeys(username);
		getPasswordTB().sendKeys(password);
		getLoginButton().click();
		

	}
	
	

}
