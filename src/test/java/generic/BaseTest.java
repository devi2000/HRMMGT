package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConst {
	public static WebDriver driver;
	@BeforeMethod
	public void preCondition(){
		String CHROME_KEY="webdriver.chromedriver";
		String CHROME_VALUE = "./drivers.chromedriver_win32";
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		 //driver1=new ChromeDriver();
		String GECKO_KEY="webdriver.geckodriver";
		String GECKO_VALUE = "./drivers.geckodriver";
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		 driver=new FirefoxDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@AfterMethod
	public void postCondition(){
		driver.quit();
	}

}