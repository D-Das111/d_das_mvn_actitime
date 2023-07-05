package actitime.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import actitime.elementRepository.LoginLocators;
import actitime.elementRepository.LogoutLocators;

public class BaseClass {
	public WebDriver driver;
	public DataUtility du = new DataUtility();
	public CommonUtility cu = new CommonUtility();
	public static WebDriver listenerDriver;

//	@Parameters("browser")
//	@BeforeClass(alwaysRun=true)
//	public void launchBrowser(String browser) {
//		if(browser.equals("chrome")) {
//			driver = new ChromeDriver();
//		}else if(browser.equals("firefox"))
//		{
//			driver = new FirefoxDriver();
//		}
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		driver = new ChromeDriver();
		listenerDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	@Parameters({"url","un","pwd"})
//	@BeforeMethod(alwaysRun = true)
//	public void login(String url,String un, String pwd) throws IOException {
//		driver.get(url);
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(pwd);
//		driver.findElement(By.id("keepLoggedInCheckBox")).click();
//		driver.findElement(By.id("loginButton")).click();
//	}

//	@BeforeMethod(alwaysRun = true)
//	public void login() throws IOException {
//		driver.get(du.getDataFromProperties("Url"));
//		driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("Username"));
//		driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("Password"));
//		driver.findElement(By.id("keepLoggedInCheckBox")).click();
//		driver.findElement(By.id("loginButton")).click();
//	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		driver.get(du.getDataFromProperties("Url"));
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDataFromProperties("Username"), du.getDataFromProperties("Password"));
		
	}

//	@AfterMethod(alwaysRun = true)
//	public void logout() {
//		driver.findElement(By.id("logoutLink")).click();
//	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		LogoutLocators ll=new LogoutLocators(driver);
		ll.logoutApp();
	}

	@AfterClass(alwaysRun = true)
	public void close() {
		driver.quit();
	}

}
