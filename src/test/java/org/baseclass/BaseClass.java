package org.baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//Declaring as Instance variable
	public static WebDriver driver;
	public static void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

//	Method1
	
	public WebElement findUserName(String id) {
	
		WebElement element = driver.findElement(By.id(id));
		return element;
			}

//	Method1 -> Flipkart
	
	public WebElement userName(String text) {
	
	WebElement name = driver.findElement(By.xpath(text));
	return name;
			}
	
//	Method2
	public void sendValues(WebElement element,String data) 
	{
	element.sendKeys(data);
	}

//	Method3
	public WebElement findPassword(String id) {
		
		WebElement password = driver.findElement(By.id(id));
		return password;
	}
	
//	Method3 -> flipkart
	public WebElement findPwd(String text) {
		
		WebElement password1 = driver.findElement(By.xpath(text));
		return password1;
	}

	//	Method4
	public void sendPassword(WebElement password, String data) {
		password.sendKeys(data);
	}
	
//	Method5
	public WebElement login(String name) {
		
		WebElement login = driver.findElement(By.name(name));
		return login;
	}
	
//	Method 5 -> Submit button Flipkart
	public WebElement submitButton(String text) {
		WebElement submit = driver.findElement(By.xpath(text));
		return submit;
	}
		
	public void submitClick(WebElement submit) {
			submit.click();

		}

	
//	Method 6 -> Click
	public void loginClick(WebElement login) {
				login.click();
		}
	
//	Method 7 -> Linked Text
	public WebElement forgotPwd(String fpwd) {
		WebElement forgotpwd = driver.findElement(By.linkText(fpwd));
		return forgotpwd;
		}
	
//	Method 8 -> Click
	public void clickFpwd(WebElement forgotpwd) {
	forgotpwd.click();
		}
	
// Method 9 -> Isdisplayed
	public void isDisplayed(String text) {
		boolean title = driver.findElement(By.xpath(text)).isDisplayed();
		if (title==true)
		{
			System.out.println("Title is displayed correctly");
		}
		else
		{
			System.out.println("Title not displayed");
		}
	}
	
//	Method 10 -> Right click
	public WebElement notYou(String text) {
		WebElement hyperlink = driver.findElement(By.xpath(text));
		return hyperlink;
	}

//	Method 11 -> To perform Right click
	public void rightclick(WebElement hyperlink) throws AWTException {
		Actions action=new Actions(driver);
		action.contextClick(hyperlink).perform();
		//action.moveToElement(hyperlink).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

//	Method 11 -> Mousehover
//	public void mouseHover(WebElement hyperlink) {
//		Actions action=new Actions(driver);
//		action.moveToElement(hyperlink).perform();

//	}
	
// Method 12
	public void goBack() {
		driver.navigate().back();
	}
	
// Method 13
	public void goForward() {
		driver.navigate().forward();
	}

// Method 14
	public void refresh() {
		driver.navigate().refresh();
	}
	
//	Method 15 -> Scrolldown
	public WebElement messengerView(String text) {
		WebElement down = driver.findElement(By.linkText(text));
		return down;
	}
	
//	Method 16 -> Perform scrolldown
	public void scrollDown(WebElement down) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		
//		To scroll down
			executor.executeScript("arguments[0].scrollIntoView(true);", down);
			Thread.sleep(3000);
					}
//		Method 17
		public WebElement viewFb(String text){
			WebElement up = driver.findElement(By.xpath(text));
			return up;
		}
		
			
//		Method 18
			public void scrollUp(WebElement up) throws InterruptedException {
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				
//				To scroll up
					executor.executeScript("arguments[0].scrollIntoView(true);", up);
					Thread.sleep(3000);
							}
			
//		Method 19
			public void getTitle() {
				String title = driver.getTitle();
				System.out.println("Title:"+title);
			}

//	Method 20
			public void getCurrenturl() {
				String currentUrl = driver.getCurrentUrl();
				System.out.println("Current URL:"+currentUrl);
			}
}
	


