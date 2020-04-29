import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DriverInterfaceRef {

String browser = "Mozilla";
	
	@Test
	public void launch(){
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");
		
		
		WebDriver driver = null;
		
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver(); 
			
		}else if(browser.equals("Chrome")){
			driver = new ChromeDriver();
			
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
			
	}
		
	driver.get("http://google.co.in");
	driver.close();
	}

}