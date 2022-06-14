package com.sgtesting.advancescenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceScenario1DemoTestNG {
	public static WebDriver obrowser=null; 

	@Test(priority = 1)
	private static void launchbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 2)
	private static void navigate() {
		try {
			obrowser.get("http://localhost:85/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
	}
	@Test(priority = 3)
	private static void Login1() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 4)
	private static void createuser1() 
	{
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
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 5)
	private static void createuser2() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser2@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 6)
	private static void createuser3() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("user3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("demouser3@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 7)
	private static void logout1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 8)
	private static void Loginuser1() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 9)
	private static void logoutuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 10)
	private static void Loginuser2() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 11)
	private static void logoutuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 12)
	private static void Loginuser3() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 13)
	private static void logoutuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	private static void Login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 15)
	private static void modifyuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 16)
	private static void modifyuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 17)
	private static void modifyuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 18)
	private static void logout2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 19)
	private static void Loginuser11() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser11");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 20)
	private static void logoutuser11() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 21)
	private static void Loginuser22() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser22");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 22)
	private static void logoutuser22() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 23)
	private static void Loginuser33() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("DemoUser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser33");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 24)
	private static void logoutuser33() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 25)
	private static void Login3() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 26)
	private static void Deleteuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 27)
	private static void Deleteuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user2, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 28)
	private static void Deleteuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='user3, demo']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert xalert = obrowser.switchTo().alert();
			String content = xalert.getText();
			System.out.println(content);
			xalert.accept();
			Thread.sleep(3000);
			System.out.println("+++++++++++++++++++ END OF ADVANCE SCENARIO 1+++++++++++++++++++++");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 29)
	private static void logout3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 30)
	private static void closeapplication() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
