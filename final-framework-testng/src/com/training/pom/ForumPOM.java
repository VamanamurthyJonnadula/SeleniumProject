package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForumPOM {
	private WebDriver driver; 
	
	public ForumPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='istooldesc_1118']")
	private WebElement Forum;
	
	@FindBy(xpath = "//div[@id='toolbar-forum']//a[1]//img[1]")
	private WebElement ForumImg;
	
	@FindBy(xpath = "//input[@id='forumcategory_forum_title']")
	private WebElement Title;
	
	@FindBy(id = "forumcategory_forum_category")
	private WebElement Groupforums;
	
	
	@FindBy(xpath = "//button[@id='forumcategory_SubmitForum']")
	private WebElement SubmitForum;
	
	
	
	 public void clickForum()
	 {
		 this.Forum.click();
		 
	 }
	 public void clickForumImg()
	 {
		 this.ForumImg.click();
	 }
	 public void Title(String Tname)
	 {
		 this.Title.sendKeys(Tname);
	 }
	 
	 //User Drop down options
	 public void selectCategory(String catName)
	 {
		 Select drpCatGroup = new Select(this.Groupforums);
		 drpCatGroup.selectByVisibleText(catName);
		  
	 }
	 
	 
	 public void clickSubmitForum()
	 {
		 this.SubmitForum.click();
	 }
}

