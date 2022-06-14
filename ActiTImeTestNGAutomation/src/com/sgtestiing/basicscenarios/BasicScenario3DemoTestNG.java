package com.sgtestiing.basicscenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicScenario3DemoTestNG {
	public static WebDriver obrowser=null;

	@Test(priority=1)
	private static void launchbroswer() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe" );
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
	@Test(priority=4, dataProvider = "customerdetails")
	private  void createcustomer(String newcust, String custdescription) {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys(newcust);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys(custdescription);
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority=5)
	private static void deletecustomer() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);
			System.out.println("+++++++++++++++++++ END OF BASIC SCENARIO 3+++++++++++++++++++++");

		} catch (Exception e) {

		}

	}

	@Test(priority=6)
	private static void logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority=7)
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
	@DataProvider(name="customerdetails")
	public Object[][] getcustomerdetails()
	{
		return new Object[][] {{"HosaCustomer","This ia new Customer"}};
	}

}
