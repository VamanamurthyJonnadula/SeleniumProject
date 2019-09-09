package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminLoginPOM;
import com.training.pom.LoginPOM;
import com.training.pom.ClassesPOM;
import com.training.pom.SubscribeusersPOM;



import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class Testcase2_SP10ELTC_027{

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminLoginPOM AdminLoginPOM;
	private ClassesPOM ClickClassesPOM;
	private SubscribeusersPOM SubscribeusersPOM; 
	
	
	private static Properties properties;
	private ScreenShot screenShot;
	private com.training.pom.AddclassesPOM ClickAddclassesPOM;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		AdminLoginPOM=new AdminLoginPOM(driver);
		ClickClassesPOM = new ClassesPOM(driver);
		SubscribeusersPOM = new SubscribeusersPOM(driver);
		
		
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	/*@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void ChangePasswordTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		
		AdminLoginPOM.AdminLoginBtn();
		ClickClassesPOM.ClickClasses();
		SubscribeusersPOM.SubscribeusersPOM();
		
		Select drpGroupPermissions = new Select(driver.findElement(By.id("first_letter_user")));			
		drpGroupPermissions.selectByVisibleText("D");
		Thread.sleep(3000);
		
		Select drpGroupPermissions1 = new Select(driver.findElement(By.id("elements_not_in")));			
		drpGroupPermissions1.selectByVisibleText("Dinesh Dinesh (dinesh)  - DINESH");
		
		driver.findElement(By.xpath("//div[@class='col-md-2']/div/button")).click();
		//driver.findElement(By.xpath("//body//form//div//div//div//button[1]")).click();	
		screenShot.captureScreenShot("TC_27");
	}
} 





