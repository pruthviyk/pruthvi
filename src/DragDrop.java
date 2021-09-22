import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragDrop
{
	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//String vtext1=driver.findElement(By.className("entry-title")).getText();
	//System.out.println(vtext1);
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	//WebElement vframe= driver.findElement(By.tagName("iframe"));
	
	WebElement w1 = driver.findElement(By.id("draggable"));
	WebElement w2 = driver.findElement(By.id("droppable"));
Actions vact= new Actions(driver);
vact.dragAndDrop(w1, w2).build().perform();
Thread.sleep(1000);
driver.switchTo().defaultContent();
String dt=driver.findElement(By.className("entry-title")).getText();
System.out.println(dt);

	}
	}