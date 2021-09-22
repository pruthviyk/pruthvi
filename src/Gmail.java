import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Gmail {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		driver.switchTo().window(ChildID);
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}