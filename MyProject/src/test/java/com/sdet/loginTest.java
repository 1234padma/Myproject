package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	
	@Test
	public  void login_Test() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	//	WebDriverWait wait= new (WebDriverWait(driver);
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		

		
	driver.findElement(By.name("password")).sendKeys("Admin123");
		
	
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	//	Thread.sleep(3000);
	//	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		//Thread.sleep(3000);
		
		driver.close();
		
	}
	
	
	
	

}
