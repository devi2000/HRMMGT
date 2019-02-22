package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage  {
	public static WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}
	public static void verifyTitle(String eTitle){
		try{
			WebDriverWait wait =new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching"+eTitle,true);
		}
		catch(Exception e){
			Reporter.log("Title is not matching",true);
		}
	}
	public static void verifyElementPresent(WebElement element){
		try{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present"+element,true);
		}
		catch(Exception e){
			Reporter.log("element not present",true);
		}
	}
	public static boolean verifyElementIsPresentOrNot(String xp){
		boolean result=true;
		try{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(xp)));
			Reporter.log("name present",false);
			result=false;
		}
		catch (Exception e){
			Reporter.log("name not present",true);
		}
		return result;
	}

}