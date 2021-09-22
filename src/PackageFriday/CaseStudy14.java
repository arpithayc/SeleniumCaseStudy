package PackageFriday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
	    WebDriver myD=new ChromeDriver();
	    myD.manage().window().maximize();
	   myD.get("https://www.google.com/");
	   
}
}