package com.sgtesting.basicscenariosdemo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario8Demo {
	public static WebDriver oBrowser=null;

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:85/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	public static void importTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filename="\"D:\\Autoit\\Sample (1).csv\"";
			copyFile(filename);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"loadTasksFromCSVPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	public static void copyFile(String filename)
	{
		StringSelection strselection=new StringSelection(filename);
		//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(strselection, null);
	}
	public static void Deletetasks() 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]/span")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"deleteTaskPopup_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(1000);

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DeleteProjectB2() 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[6]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void DeleteProjectB1() 
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[5]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DeleteProjectA1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void Logout() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"logoutLink\"]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void closeapp() {
		try {
			oBrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

