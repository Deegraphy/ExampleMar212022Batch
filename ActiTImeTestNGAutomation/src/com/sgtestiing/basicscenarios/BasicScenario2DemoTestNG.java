package com.sgtestiing.basicscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicScenario2DemoTestNG {
	public static WebDriver obrowser=null;

	@Test(priority=1)
	private static void launchbrowser() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\ActiTImeTestNGAutomation\\Library\\Drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=2)
	private static void navigate() {
		try {
			obrowser.get("http://localhost:85/login.do");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=3,dataProvider="logindetails")
	private  void login(String user, String pwd)  {
		try {
			obrowser.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=4, dataProvider="UserDetails" )
	private  void createuser( String Fname, String Lanme, String email, String Username, String pwd ,String pwdcopy )
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(3000);
			obrowser.findElement(By.name("firstName")).sendKeys(Fname);
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys(Lanme);
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys(email);
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys(Username);
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys(pwdcopy);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority=5,dataProvider="Modifyuser")
	private  void modify( String Firname ){
		try {
			obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys(Firname);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);	
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=6)
	private static void deleteuser() {
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
			System.out.println("+++++++++++++++++++ END OF BASIC SCENARIO 2+++++++++++++++++++++");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=7)
	private static void Logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=8)
	private static void closeapplication() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@DataProvider(name="logindetails")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider(name="UserDetails")
	public Object[][] getUserDetails()
	{
		return new Object[][] {{"demo","user1","demouser1@gmail.com","DemoUser1","DemoUser1","DemoUser1"}};
	}
	
	@DataProvider(name="Modifyuser")
	public Object[][] getModifyuser()
	{
		return new Object[][] {{"Sample"}};
	}

}
