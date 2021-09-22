import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
    	driver.get("https://www.linkedin.com/login");
    	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.name("session_password")).sendKeys("123");
  driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
  Thread.sleep(2000);
 
	}

}
