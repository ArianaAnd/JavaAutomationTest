import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript01 {

    

    public static void main(String[] args) throws Exception {	  
	
    	//Setup Chrome driver    	
    	System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();


	    }
	

    }

