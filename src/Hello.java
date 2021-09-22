import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {
	

	public static void main(String[] args) throws InterruptedException {
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.Firefox.driver", "C:\\Users\\00005321\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//driver.get("https://www.firefox.com/");
		String vtitle=driver.getTitle();
		System.out.println("This is "+vtitle);
		Thread.sleep(5000);
		driver.close();
		
	}
}
}
