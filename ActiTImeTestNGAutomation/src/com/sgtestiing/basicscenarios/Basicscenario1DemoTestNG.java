package com.sgtestiing.basicscenarios;




import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Basicscenario1DemoTestNG {
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	private  void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\ActiTImeTestNGAutomation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private  void navigate()
	{
		try {
			oBrowser.get("http://localhost:85/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=3,dataProvider="logindetails")
	private  void login(String user, String pwd) 
	{
		try {
			oBrowser.findElement(By.name("username")).sendKeys(user);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=4, dataProvider="UserDetails" )
	private  void createuser( String Fname, String Lanme, String email, String Username, String pwd ,String pwdcopy ) 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys(Fname);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys(Lanme);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys(email);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys(Username);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdcopy);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=5)
	private  void deleteuser() {
		try {
			oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert oalert = oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(3000);
			System.out.println("+++++++++++++++++++ END OF BASIC SCENARIO 1+++++++++++++++++++++");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=6)
	private  void logout() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=7)
	private  void closeapplication() 
	{
		try {
			oBrowser.quit();
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


}
