package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TpesofWorksLocators {
	public TpesofWorksLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Create Type of Work']")
	private WebElement createTypeofWorkBtn;
	
	@FindBy(id="name")
	private WebElement nameTb;
	
	@FindBy(xpath="//td[@id='ButtonPane']/input[@type='button']")
	private WebElement cancelBtn;
	
	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getCreateTypeofWorkBtn() {
		return createTypeofWorkBtn;
	}

	public WebElement getNameTb() {
		return nameTb;
	}
	
	public void createTypeofWork(String workname) {
		getCreateTypeofWorkBtn().click();
		getNameTb().sendKeys(workname);
//		getNameTb().sendKeys("work");
		getCancelBtn().click();
	}

}
