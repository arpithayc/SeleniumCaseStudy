package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseStudy12Mouse {
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
	    WebDriver myD=new ChromeDriver();
		myD.get("http://www.youcandealwithit.com");
		Actions action=new Actions(myD);
		myD.findElement(By.linkText("Borrowers"))).build().perform();
	}
}
