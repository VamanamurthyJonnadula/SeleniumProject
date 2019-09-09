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
import com.training.pom.AddclassesPOM;
import com.training.pom.AddclassesButtonPOM;
import org.testng.Assert;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;



public class Testcase1_SP10ELTC_026{

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private AdminLoginPOM AdminLoginPOM;
	private ClassesPOM ClickClassesPOM;
	private AddclassesPOM AddclassesPOM;
	private AddclassesButtonPOM AddclassesButtonPOM;
	
	
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
		ClickAddclassesPOM = new AddclassesPOM(driver);
		AddclassesButtonPOM = new AddclassesButtonPOM(driver); 
		
		
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
	public void Addclass() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		Thread.sleep(5000);
		
		AdminLoginPOM.AdminLoginBtn();
		ClickClassesPOM.ClickClasses();
		ClickAddclassesPOM.Addclasses();
		AddclassesButtonPOM.AddclassesButton("Demo222");
		AddclassesButtonPOM.AddclassesButton1("Demo1");
		
		//For Scroll down 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
		//Select drpGroupPermissions = new Select(driver.findElement(By.xpath("//div[@class='col-sm-8']/div/select")));
		//drpGroupPermissions.selectByVisibleText("Open");
		
		Select drpGroupPermissions = new Select(driver.findElement(By.id("usergroup_visibility")));			
		drpGroupPermissions.selectByVisibleText("Open");
		
		//For AddButton		
		AddclassesButtonPOM.AddPOM();
		screenShot.captureScreenShot("TC_26");

		boolean classadded = AddclassesButtonPOM.istextpresent() ;
		Assert.assertTrue(classadded);
		
		        
	}
} 





