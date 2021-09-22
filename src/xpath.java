import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath 
{
	
	public static String SearchData="Selenium";

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver myD=new ChromeDriver();
	
	myD.get("https://www.google.com/");
	myD.manage().window().maximize();
	Thread.sleep(2000);
	myD.findElement(By.xpath("//input[@name='q']")).sendKeys(SearchData);
	myD.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	Thread.sleep(2000);
	String vSearch=myD.findElement(By.xpath("//*[@class='gLFyf gsfi']")).getAttribute("value");
	//System.out.println(vSearch);
	if (SearchData.equals(vSearch)) {
	System.out.println("Pass");
	}
	else
		System.out.println("Fail");	
	
	
	
	Thread.sleep(5000);
	myD.close();
	
	
	}
		
	}