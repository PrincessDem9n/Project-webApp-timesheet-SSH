package com.dvops.maven.eclipse;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class launchTest{
  //declare Selenium WebDriver
	private WebDriver webDriver;
	//private HttpServletRequest request;
    //private HttpServletResponse response;
	//private loginservlets servlet;
  
	@BeforeTest
	public void beforeTest() {
		  //Setting system properties of ChromeDriver
		  //to amend directory path base on your local file path
			String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";
			System.setProperty("webDriver.chrome.driver", chromeDriverDir);
		  //initialize FirefoxDriver at the start of test
			webDriver = new ChromeDriver();
			}
	
   @Test  
   public void checkTitle() {
	  //Load website as a new page
	   webDriver = new ChromeDriver();
	   webDriver.navigate().to("http://localhost:8090/Project/launch.jsp");
	  
	  //Assert the title to check that we are indeed in the correct website
	   Assert.assertEquals(webDriver.getTitle(), "Home Page");
	   System.out.println("title: "+webDriver.getTitle());
   		}
	
   @Test
   public void testButtonPresence() throws ServletException, IOException {
	   webDriver = new ChromeDriver();
	   //request = Mockito.mock(HttpServletRequest.class);
       //response = Mockito.mock(HttpServletResponse.class);
       
	   webDriver.navigate().to("http://localhost:8090/Project/launch.jsp");
	   
	   // Find the button by its name
	   WebElement button = webDriver.findElement(By.id("Call Login Servlet"));
        button.click();
        //Verify the title of the new page
        System.out.println("title: "+webDriver.getTitle());
        
        //servlet.doPost(request, response);
        }
  
  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.close();			
  }
 }