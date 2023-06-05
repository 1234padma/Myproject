package com.sdet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	
	@Test
	public void loginTest() throws InterruptedException   {
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
             
          driver.findElement(By.name("q")).sendKeys("java");   
          
      //	WebDriverWait wait= new WebDriverWait(driver,20);
      	
     // 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));  
          
      List<WebElement>list  = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
      
    System.out.println(list.size());
      
      for(int i=0; i<list.size();i++) {
    	  
    	
    	//  System.out.println( list.get(i).getText());
    	 String listItem =list.get(i).getText();
    	  
      if(listItem.contains("java download")) {
    		  
    		  list.get(i).click();
    
    		  
    		  break;
    	  } 
    	  
    	  
    	  
    	
      }
      
      
      
       
   driver.close();
      
	}

	

}
