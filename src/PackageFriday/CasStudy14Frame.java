package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CasStudy14Frame {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/droppable/");
    //driver.switchTo().frame(0);
    driver.switchTo().frame(driver.findElement(By.className("entry-title")));
    System.out.println(driver.findElement(By.id("draggable")).getText());
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Thread.sleep(2000);
	
	Actions action=new Actions(driver);
	action.dragAndDrop(drag, drop).build().perform();
	
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.className("entry-title")).getText());
	driver.close();
}
}