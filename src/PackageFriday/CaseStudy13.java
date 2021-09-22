package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseStudy13 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	myD.get("https://www.amazon.in");
	Actions action=new Actions(myD);
	//action.moveToElement(myD.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	action.moveToElement(myD.findElement(By.id("nav-link-accountList"))).build().perform();
	Thread.sleep(5000);
	myD.findElement(By.linkText("Your Account")).click();
			
	myD.close();
}
}