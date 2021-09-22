package PackageFriday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.get("https://www.linkedin.com/login");
		  
		  driver.findElement(By.id("username_")).sendKeys("admin");
		 
		  //driver.findElement(By.name("session_password")).sendKeys("123");
		  
		  //driver.findElement(By.xpath(" //*[@id=\"organic-div\"]/form/div[3]/button")).click();
		  
		  //Thread.sleep(5000);
		  
		  driver.close();
		  
	
}
}