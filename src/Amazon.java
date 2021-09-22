import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon
{
	

	public static void main(String[] args) throws InterruptedException  
	{
		
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	Select dropdown= new Select(driver.findElement(By.id("searchDropdownBox")));
	dropdown.selectByVisibleText("Deals");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung zfold3");
driver.findElement(By.id("nav-search-submit-button")).click();
          driver.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/span")).click();
         String vSearch= driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
         String vTitle= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
         
System.out.println("String is "+vSearch);
System.out.println("String is "+vTitle);
if (vSearch.contains("zfold3"))
{
	System.out.println("Search Result : Pass");
}
else {
	System.out.println("Search result :Fail");
}

if (vTitle.equals("zfold3"))
{
	System.out.println("vTitle is  : Pass");
}
else {
	System.out.println("vTitle is :Fail");
}
	
	driver.close();
	
	System.out.println("End of the Test");
	
		
	}
	

}

