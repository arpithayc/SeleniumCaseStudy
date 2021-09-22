package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy8 {
    public static String Searchdata="testing";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com//");
		   driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Searchdata);
			driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		String vSearch=	driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
		Thread.sleep(5000);
			System.out.println(vSearch);
			if(vSearch.equals(Searchdata)) {
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			Thread.sleep(5000);
			driver.close();
} 
}