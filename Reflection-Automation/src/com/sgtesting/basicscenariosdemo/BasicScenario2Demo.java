package com.sgtesting.basicscenariosdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario2Demo {
	public static WebDriver obrowser=null;

	public static void launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\CurrentWorkSpace\\ExampleMar212022Batch\\Reflection-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void navigate() {
		try {
			obrowser.get("http://localhost:85/login.do");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void createuser() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void Modifyuser() {
		try {
			obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Sample");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(1000);	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void deleteuser() {
		try {
			obrowser.findElement(By.xpath("//span[text()='user1, Sample']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert oalert = obrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void closeapplication() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
