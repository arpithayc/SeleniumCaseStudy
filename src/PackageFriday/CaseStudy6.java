package PackageFriday;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy6 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	    Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the Browser");
			String browser=Sc.nextLine();
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			linkdinLogin();
			
		}
				else if(browser.equalsIgnoreCase("Edge")){
			    System.setProperty("webdriver.edge.driver","C:\\Selenium_folder\\edgedriver_win32\\msedgedriver.exe");
				driver = new EdgeDriver();
				linkdinLogin();
				}
		else{
			
			System.out.println("Invalid");
		}
		
	}

	public static  void linkdinLogin()throws InterruptedException{
		driver.get("https://www.linkedin.com/login");
		 driver.findElement(By.id("username")).sendKeys("adamin");
		 driver.findElement(By.name("session_password")).sendKeys("123");
		 driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
	     WebElement message= driver.findElement(By.id("error-for-username"));
	     System.out.println("The error message is :"+ message.getText());
	     driver.findElement(By.linkText("Forgot password?")).click();
	     driver.findElement(By.partialLinkText("Sign")).click();
	}
}