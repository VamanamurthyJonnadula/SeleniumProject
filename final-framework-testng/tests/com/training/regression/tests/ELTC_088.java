
package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.CoursescatalogSearchPOM;
import com.training.pom.AssignmentsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_088 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM LoginPOM;
	private CoursescatalogSearchPOM CoursescatalogSearchPOM;
	private AssignmentsPOM AssignmentsPOM;
	
	
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginPOM = new LoginPOM(driver); 
		CoursescatalogSearchPOM = new CoursescatalogSearchPOM(driver);
		AssignmentsPOM = new AssignmentsPOM(driver);
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	//@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void ELTC_088() {
		LoginPOM.sendUserName("admin");
		LoginPOM.sendPassword("admin@123");
		LoginPOM.clickLoginBtn(); 
		CoursescatalogSearchPOM.mycourselink();
		CoursescatalogSearchPOM.Userportallink();
		AssignmentsPOM.clickAssignmentslink();
		AssignmentsPOM.clickCreateAssignlink();
		AssignmentsPOM.AssignName("Test case43");
		AssignmentsPOM.clickValidateSubmitbtn();
		
		screenShot.captureScreenShot("TC_88");
		
		//Assert.assertEquals(AssignmentsPOM.getDirectoryCreated(), "Directory created");
		Assert.assertTrue(AssignmentsPOM.getDirectoryCreated());
							
	}
}
