package com.dvops.maven.eclipse;
import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
   @Test  
  public void checkTitle() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8080/Project/userservlets/dashboard");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Mott MacDonald Timesheet App");
	  System.out.println("title: "+webDriver.getTitle());
	  }
	
   @Test
   public void testButtonPresence() {
        webDriver.get("http://localhost:8080/Project/userservlets/dashboard");
        
        // Find the button by its name
        WebElement button = webDriver.findElement(By.linkText("Add New Employee"));
        button.click();       
        // Check if the button is displayed
        //assertTrue(button.isDisplayed());
      
     // Verify the title of the new page
        Assert.assertEquals(webDriver.getTitle(), "Mott MacDonald Timesheet App");
  	    System.out.println("title: "+webDriver.getTitle());
        }
  
	@BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
	  System.setProperty("webDriver.chrome.driver", chromeDriverDir);
	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.close();			
  }
 }