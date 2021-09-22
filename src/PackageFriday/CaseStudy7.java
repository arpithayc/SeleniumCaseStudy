package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.mortgagecalculator.org/");
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   driver.findElement(By.id("homeval")).sendKeys("1000");
		   Thread.sleep(5000);
		   driver.findElement(By.id("downpayment")).sendKeys("2000");
		   Thread.sleep(5000);
		   driver.findElement(By.cssSelector("input[value='money']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.name("cal")).click();
		   Thread.sleep(5000);
		   
		   
		
}
}