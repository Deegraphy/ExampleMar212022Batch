package com.sgtesting.basicscenariosdemo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicscenario1Demo {
	public static WebDriver oBrowser=null;
	
	
	public  static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\\\CurrentWorkSpace\\\\ExampleMar212022Batch\\\\Reflection-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try {
			oBrowser.get("http://localhost:85/login.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void login() 
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void createuser() 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void deleteuser() {
		try {
			oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
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
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void closeapplication() 
	{
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
