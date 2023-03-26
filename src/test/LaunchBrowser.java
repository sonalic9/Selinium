package test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get ("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		WebElement userName =driver.findElement(By.name("email"));
		userName.sendKeys("assamase@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Abc@12345");
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		System.out.println("invalid user id");
		
	

}
}