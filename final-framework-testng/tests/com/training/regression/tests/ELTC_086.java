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
import com.training.pom.CoursecatalogPOM;
import com.training.pom.CoursescatalogSearchPOM;
import com.training.pom.userportalPOM;
import com.training.pom.CourseDetailsPagePOM;
import com.training.pom.exercisemainPOM;
import com.training.pom.exerciseoverviewPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_086 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM LoginPOM;
	private CoursecatalogPOM CoursecatalogPOM;
	private CoursescatalogSearchPOM CoursecatalogSearchPOM;
	private userportalPOM userportalPOM;
	private CourseDetailsPagePOM CourseDetailsPagePOM;
	private exercisemainPOM exercisemainPOM;
	private exerciseoverviewPOM exerciseoverviewPOM;
	
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
		CoursecatalogPOM = new CoursecatalogPOM(driver); 
		CoursecatalogSearchPOM = new CoursescatalogSearchPOM(driver);
		userportalPOM = new userportalPOM(driver);
		CourseDetailsPagePOM = new CourseDetailsPagePOM(driver);
		exercisemainPOM = new exercisemainPOM(driver);
		exerciseoverviewPOM = new exerciseoverviewPOM(driver);
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
	
	public void ELTC_086() {
		
		LoginPOM.sendUserName("rekhab");
		LoginPOM.sendPassword("rekhab");
		LoginPOM.clickLoginBtn(); 
				
		CoursecatalogPOM.ClickCoursecatalog();
	    
		CoursecatalogSearchPOM.CoursecatalogSearch("Selenium-Webdriver1");
		CoursecatalogSearchPOM.clickcatalogSearchbtn();
		CoursecatalogSearchPOM.mycourselink();
		userportalPOM.clickcourseNamelink();
		CourseDetailsPagePOM.clickTestlink();
		exercisemainPOM.clickexercisemainlink();	
		exerciseoverviewPOM.clickexerciseoverview();
		exerciseoverviewPOM.overviewanswer();
		exerciseoverviewPOM.endbtn();
		screenShot.captureScreenShot("TC_86");
		
		Assert.assertTrue(exerciseoverviewPOM.getSavedPage());
						
	}
}
