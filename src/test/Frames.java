package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.switchTo().frame("frame1");
		WebElement ChildHeader = driver.findElement(By.id("SampleHeading"));
System.out.println("Header in child win is " + ChildHeader.getText());
			driver.close();

		

	}

}
