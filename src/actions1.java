import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actions1
{
	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	Actions vact= new Actions(driver);
	vact.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
	}
	}