package PackageFriday;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy15 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
	    
         String vtitle =driver.getTitle();
          System.out.println(vtitle);
          
          driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
          driver.findElement(By.xpath("//a[text()='Help']")).click();
          String vhelp =driver.getTitle();
          System.out.println(vhelp);
          Thread.sleep(2000);
          
          Set <String> id=driver.getWindowHandles();
          System.out.println(id);
          Iterator <String> it=id.iterator();
          
          String ParentID=it.next();
          String ChildID=it.next();
          Thread.sleep(2000);
          System.out.println("Parent Id:"+ParentID);
          System.out.println("Child ID:"+ChildID);
          
          driver.switchTo().window(ChildID);
          
          Thread.sleep(2000);
          System.out.println(driver.getTitle());
          
          Thread.sleep(2000);
          
          driver.quit();
          
     
}}