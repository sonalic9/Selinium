package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get ("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		
		//WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		//WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		//WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		//WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			
			
		WebElement fName = driver.findElement(By.cssSelector("//input[@name='firstname']"));
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			
		fName.sendKeys("Monalisa");
		lName.sendKeys("kasani");
		mobile.sendKeys("123456789");
		password.sendKeys("Ancp@1234");
		
		
	}

}
