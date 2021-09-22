import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Expense
{
	 public static String vfood= String.valueOf(300);
	 public static String cloth= String.valueOf(200);
	 public static String shelter= String.valueOf(100);
	 public	static  String monthlyPay= String.valueOf(600);
	 public static String monthlyOther= String.valueOf(200);

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	
	driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.id("food")).sendKeys(vfood);
	driver.findElement(By.id("clothing")).sendKeys(cloth);
	driver.findElement(By.id("shelter")).sendKeys(shelter);
	Thread.sleep(2000);
	driver.findElement(By.id("monthlyPay")).sendKeys(monthlyPay);
	Thread.sleep(2000);
	driver.findElement(By.id("monthlyOther")).sendKeys(monthlyOther);
	Thread.sleep(2000);
	String  MI =driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	String  ME =driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	Thread.sleep(2000);
	System.out.println("MonthlyIncome"+MI);
	System.out.println("Monthlyexpense"+ME);
	Thread.sleep(2000);
	Double mid=Double.valueOf(MI);
	
	Double med=Double.valueOf(ME);
	Thread.sleep(2000);
	if (mid> med) {
		System.out.println("Income is Greater");
	}
	else if (mid==med)
	{
			System.out.println("Income equal to Expense");
	}
	else
	{
		System.out.println(" Expense is greater");
	}
	
	driver.close();

	System.out.println("End of the Test");
	
	}
}

	



