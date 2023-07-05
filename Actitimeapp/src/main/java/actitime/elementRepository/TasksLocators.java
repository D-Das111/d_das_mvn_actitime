package actitime.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksLocators {
	public TasksLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".title.ellipsis")
	private WebElement addnewBtn;

	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newcustomerBtn;

	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entercusnameTb;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercusdescTb;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createcusBtn;

	private WebElement titleeditBtncontainerText;

	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewcustomerBtn() {
		return newcustomerBtn;
	}

	public WebElement getEntercusnameTb() {
		return entercusnameTb;
	}

	public WebElement getEntercusdescTb() {
		return entercusdescTb;
	}

	public WebElement getCreatecusBtn() {
		return createcusBtn;
	}

	public WebElement getTitleeditBtncontainerText() {
		return titleeditBtncontainerText;
	}
	
	public By customerCreate(String cusname, String desc) {
		getAddnewBtn().click();
		getNewcustomerBtn().click();
		getEntercusnameTb().sendKeys(cusname);
		getEntercusdescTb().sendKeys(desc);
		getCreatecusBtn().click();
		By locator=By.xpath("//div[@class='titleEditButtonContainer']");
		return locator;
	}

}
