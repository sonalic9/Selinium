package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverJaava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get ("http://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		List<WebElement> Rows=  driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		System.out.println("total no of colums are"+ Rows.size());
		List<WebElement> Column=  driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("total no of colums are"+ Column.size());
		List<WebElement> data=  driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("The data is \" + data.getText()");
for(int i=2;i<=Rows.size();i++) {
						List<WebElement> ColumnsData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));
						System.out.println(ColumnsData.get(0).getText() + " " + ColumnsData.get(1).getText() + " " + ColumnsData.get(2).getText()) ;

	}

}
}