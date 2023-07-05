package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class curTasksLocators {
	public curTasksLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnew;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomer;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTB;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBTN;

	@FindBy(className = "greyButton cancelBtn")
	private WebElement cancelBTN;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']")
	private WebElement titelEditButtonContainer;

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCustomerNameTB() {
		return enterCustomerNameTB;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getCreateCustomerBTN() {
		return createCustomerBTN;
	}

	public WebElement getCancelBTN() {
		return cancelBTN;
	}

	public WebElement getTitelEditButtonContainer() {
		return titelEditButtonContainer;
	}
	
	public void customerCreate(String custermer, String description) {
		getAddnew().click();
		getNewCustomer().click();
		getEnterCustomerNameTB().sendKeys(custermer);
		getEnterCustomerDescription().sendKeys(description);
		getCreateCustomerBTN().click();
		String res=getTitelEditButtonContainer().getText();
		System.out.println(res);
	}

}
