package launchBrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
	
	    WebDriver driver = new ChromeDriver();
		//go to website
		driver.get("https://www.selenium.dev/");
		//maximize
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	
	
}
