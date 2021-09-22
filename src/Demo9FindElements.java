import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Demo9FindElements {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		Thread.sleep(3000);
		int vSubmit=myD.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Total Submit Buttons are "+vSubmit);
		
		int vLink=myD.findElements(By.tagName("a")).size();
		System.out.println("Total Links are "+vLink);
		
		for (int i=0;i<vLink;i++)
		{
			String vURL=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
			//String vURL=myD.findElements(By.tagName("a")).get(i).getText();
			System.out.println(vURL);
			
			if(vURL.contains("Gmail"))
			{
				myD.findElements(By.tagName("a")).get(i).click();
				break;
			}
			
		}
		
		
		
		myD.close();

	}

}