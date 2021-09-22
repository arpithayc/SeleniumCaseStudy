package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy11 {
	public static void main(String[] args) throws InterruptedException  
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.amazon.in/");
	//myD.findElement(By.id("searchDropdownBox")).click();
	Select Category=new Select(myD.findElement(By.id("searchDropdownBox")));
	Category.selectByValue("search-alias=todays-deals");
	Thread.sleep(2000);
	
	myD.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung zfold3");
	myD.findElement(By.xpath("//input[@value='Go']")).click();
	Thread.sleep(2000);
	
	myD.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/div/label/i")).click();
	Thread.sleep(2000);
	
	//String Result=myD.findElement(By.className("a-section a-spacing-small a-spacing-top-small")).getText();
	String Result=myD.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]")).getText();
			
			
	System.out.println(Result);
	
	if(Result.contains("fold3")) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	String title=myD.getTitle();
	if(title.contains("fold3")) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	System.out.println("End of Test");
	
	myD.close();

	
}}