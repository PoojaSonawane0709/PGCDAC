package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
	WebDriver dr;
  @Test
  public void f() {
	  dr.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	
	  WebElement we=dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
	  we.sendKeys("Pooja");
	  
	  WebElement we1=dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
	  we1.sendKeys("Sonawane");
	  
	  WebElement we2=dr.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
	  we2.sendKeys("9284484166");
	  
	  WebElement we3=dr.findElement(By.xpath("//input[@id='userName']"));
	  we3.sendKeys("poojasona@gmail.com");
	  
	  WebElement we4=dr.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
	  we4.sendKeys("Nashik City");
	  
	  WebElement we5=dr.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
	  we5.sendKeys("Nashik");
	  
	  WebElement we6=dr.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
	  we6.sendKeys("Maharashtra");
	  
	  WebElement we7=dr.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
	  we7.sendKeys("422101");
	  
	  WebElement we8=dr.findElement(By.xpath("//input[@id='email']"));
	  we8.sendKeys("PoojaSona");
	  String username=we8.getAttribute("value");
	  System.out.println("USERNAME IS :"+username);
	
	  WebElement we9=dr.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]"));
	  we9.sendKeys("Pooja123");
	  
	  WebElement we10=dr.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]"));
	  we10.sendKeys("Pooja123");
	  String password=we10.getAttribute("value");
	  System.out.println("PASSWORD IS :"+password);
	  //Drop Down List
	  Select country=new Select(dr.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
	  country.selectByVisibleText("INDIA");

	  dr.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
	  
	  dr.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
	  
	  //Log In
	  WebElement un= dr.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
	  un.sendKeys(username);
	  WebElement pwd=dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
	  pwd.sendKeys(password);
	  
	  dr.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\SeleniumData\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	  dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  
	  dr.get("https://demo.guru99.com/test/newtours/");
	  String url=dr.getCurrentUrl();
	  System.out.println("Url of the Current Page :"+url);
	  
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
