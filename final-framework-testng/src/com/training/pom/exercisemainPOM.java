package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exercisemainPOM {private WebDriver driver; 
	
	public exercisemainPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//tr[@id='exercise_list_96']//a[contains(text(),'webdriver - Test1')]")
	private WebElement exercisemain;
	
	

	 public void clickexercisemainlink()
	 {
		 this.exercisemain.click();
	 }
	 
}

