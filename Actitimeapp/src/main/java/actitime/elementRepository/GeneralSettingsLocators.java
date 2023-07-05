package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsLocators {
	public GeneralSettingsLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement topgroupinglevelDdown;
	@FindBy(id="FormModifiedTextCell")
	private WebElement modificationnotSavedTxt;
	
	
	public WebElement getTopgroupinglevelDdown() {
		return topgroupinglevelDdown;
	}
	public String getModificationnotSavedTxt() {
		return modificationnotSavedTxt.getText();
	}
	
	

}
