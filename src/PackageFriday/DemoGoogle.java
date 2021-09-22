package PackageFriday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGoogle {
	public class Demo3 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
			   
			   driver.get("http://www.google.com");
			  String Title=driver.getTitle();
			  
			  System.out.println(Title);
			  Thread.sleep(5000);
			  
			  /*if(Title.equals("Google")) {
				   System.out.println("Pass");
			   }
			   else {
				   System.out.println("failed The title is: "+Title);
			   }
			   
			  /* if(url.contains("com")) {
				System.out.println("pass"+url);   
			   }
			   else {
				   System.out.println("fail");
			   }*/
			  
			driver.close();
			
		}
	}
}
