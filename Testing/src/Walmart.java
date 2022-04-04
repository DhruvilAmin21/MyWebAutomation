import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.ca/en");
		int j=0;
		String[] items = {"Cucumber","Brocolli","Potato","Tomato"};
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/button[1]")).click();
	}

}
