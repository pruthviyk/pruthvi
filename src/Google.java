import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
  driver.get("https://google.com");
  driver.manage().window().maximize();
  Thread.sleep(2000);
  //driver.findElement(By.id("input")).sendKeys("wikipedia");
  //driver.findElement(By.xpath("//*[@id="input"]")).SendKeys("wikipedia");
  driver.findElement(By.className("gb_f")).click();
  //driver.findElement(By.linkText("Gmai")).click();
  driver.findElement(By.className("laptop-desktop-only")).click();
  driver.findElement(By.id("firstName")).sendKeys("Pruthvi");
  driver.findElement(By.id("lastName")).sendKeys("Kalegowda");
  driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
  String msg =driver.findElement(By.className("o6cuMc")).getText();
  System.out.println("Error is "+msg);;
  //driver.close();
  
	}

}
