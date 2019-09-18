package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.CoursescatalogSearchPOM;
import com.training.pom.ForumPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ELTC_044 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM LoginPOM;
	private CoursescatalogSearchPOM CoursescatalogSearchPOM;
	private ForumPOM ForumPOM;
	
	
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
		ForumPOM = new ForumPOM(driver);
		
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
	public void ELTC_044() throws InterruptedException {
		LoginPOM.sendUserName("admin");
		LoginPOM.sendPassword("admin@123");
		LoginPOM.clickLoginBtn(); 
		CoursescatalogSearchPOM.mycourselink();
		CoursescatalogSearchPOM.Userportallink();
		ForumPOM.clickForum();
		ForumPOM.clickForumImg();
		ForumPOM.Title("New IBM Group ");
		ForumPOM.selectCategory("NewGroup");
		Thread.sleep(10000);
		ForumPOM.clickSubmitForum();
		
		
		
						
	}
}
