package scripts;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test
	public void testCreateEmployee(){
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickpimMenu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("bob");
		pi.setLastName("builder");
		pi.clickSaveBtn();
		pi.verifyFirstname("bob");
		
}
@Test
public void testDeleteEmployee() throws Exception{
	HomePage pi=new HomePage(driver);
	pi.setUserName("Admin");
	pi.setPwd("admin123");
	pi.clickLogin();
	BasePage.verifyTitle("OrangeHRM");
	pi.clickpimMenu();
	pi.clickAddEmpList();
	pi.clickEmpCheckBox("siva");
	pi.clickDelete();
	Thread.sleep(2000);
	pi.clickOK();
	Thread.sleep(1000);
	pi.verifyEmpIsNotPresent("siva");
	
	
		
}
}
