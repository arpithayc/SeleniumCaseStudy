package PackageFriday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy12 {

	public static void main(String[] args) throws InterruptedException  
	{
		String vFood="250";
		String vClothing="300";
		String vShelter="400";
		String vMonthlyPay="50";
		String vMonthlyOther="200";
		//String vMonthlyIncome="150";
	
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_folder\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	myD.findElement(By.id("food")).sendKeys(vFood);
	myD.findElement(By.id("clothing")).sendKeys(vClothing);
	myD.findElement(By.id("shelter")).sendKeys(vShelter);
	myD.findElement(By.id("monthlyPay")).sendKeys(vMonthlyPay);
	myD.findElement(By.id("monthlyOther")).sendKeys(vMonthlyOther);
	String vMonthlyIncome =myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	System.out.println("The total monthly income is :"+vMonthlyIncome);
	String vMonthlyExpenses =myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	System.out.println("The total monthly Expense is :"+vMonthlyExpenses);
	Thread.sleep(5000);
	Double monthlyIncome = Double.valueOf(vMonthlyIncome);
	Double monthlyExpense = Double.valueOf(vMonthlyExpenses);
	
	if(monthlyIncome> monthlyExpense) {
		
		System.out.println("Income is Greater");
	}
	else {
		System.out.println("Expense is Greater");
	}
	System.out.println("End Test");
	myD.close();
	
}}
