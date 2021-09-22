package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy9 {
	public static void main(String[] args) throws InterruptedException  
	{
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.mortgagecalculator.org/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	myD.findElement(By.id("homeval")).sendKeys("2000");
	myD.findElement(By.id("downpayment")).sendKeys("200");
	
	myD.findElement(By.xpath("//input[@value='percent']")).click();
	if(myD.findElement(By.xpath("//input[@value='percent']")).isSelected()) {
		System.out.println(The Radio button );
	}
	
	myD.findElement(By.xpath("//input[@value='Calculate']")).click();
	
	
	String vMPay=myD.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
	System.out.println("Total Montly Payment is "+vMPay);
	
	Thread.sleep(5000);
	myD.close();
	
	
}
}