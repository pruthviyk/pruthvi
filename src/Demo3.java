import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Demo3
{
 
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter your choice :");
		System.out.println("1 - Chrome    	2 - Edge   3 - Firefox	 4. Safari ");
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		do {
			System.out.println("Enter your choice : ");
			choice = scanner.nextLine();
			
			if("1".equals(choice)) {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
    	driver.get("https://www.linkedin.com/login");
    	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.name("session_password")).sendKeys("123");
  driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
  Thread.sleep(2000);
  String msg=driver.findElement(By.xpath("//*[@id=\"error-for-username\"]")).getText();
  System.out.println("Error is: "+msg);
  driver.findElement(By.linkText("Forgot password?")).click();
  driver.findElement(By.partialLinkText("Sign")).click();
  driver.close();
	}
			else if("2".equals(choice)) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.linkedin.com/login");
	Thread.sleep(2000);
driver.findElement(By.id("username")).sendKeys("Admin");
driver.findElement(By.name("session_password")).sendKeys("123");
driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
Thread.sleep(2000);
String msg=driver.findElement(By.xpath("//*[@id=\"error-for-username\"]")).getText();
System.out.println("Error is: "+msg);
driver.findElement(By.linkText("Forgot password?")).click();
driver.findElement(By.partialLinkText("Sign")).click();
driver.close();

}else if("3".equals(choice)) {
	System.out.println("Invalid");
}else if("4".equals(choice)) {
	System.out.println("Invalid");
}

}while (!"5".equals(choice));
}
}
	