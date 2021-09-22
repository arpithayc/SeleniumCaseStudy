package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudyLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    String vurl=driver.findElement(By.tagName("a")).getText();
    for(int i=0;i<vurl;i++) {
    
    System.out.println(vurl);
    driver.close();
}
}
