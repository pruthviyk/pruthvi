import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementscount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		int vSubmit= driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Total submit button is "+vSubmit);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
	
		int vLink=driver.findElements(By.tagName("a")).size();
		
		System.out.println("Total links is "+vLink);
		
		for (int i=0;i<vLink;i++)
		{
			String uRL=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			//String vURL=driver.findElements(By.tagName("a")).get(i).getText();
			System.out.println(uRL);
			
			if(uRL.contains("Gmail"))
			{
				driver.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		
		
		
		driver.close();
	}
}
