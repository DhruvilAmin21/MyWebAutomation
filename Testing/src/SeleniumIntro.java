import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome- ChromeDriver exten -> Methods close get
		//Firefox- FirefoxDriver exten -> Methods close get
		//Safari- SafariDriver exten -> Methods close get
		//WebDriver close get
		//WebDriver methods + class browser
		
		//chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		
		//webdriver.chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		//webdriver.gecko.driver
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
				
		//Firefox launch
		//geckodriver
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		//webdriver.edge.driver
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\msedgedriver.exe");
		
		//MSEdge launch
		WebDriver driver2 = new EdgeDriver();
		
		
		//webdriver.edge.driver
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\msedgedriver.exe");
		
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		//driver.close();
		driver.quit();
	}

}
