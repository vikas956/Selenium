import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Browsertest {
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver", "C:\\Tools\\Eclipse\\SeleniumFramework\\Driver\\GeckoDriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	 WebDriver Driver = new FirefoxDriver();
	 Driver.get("http://10.184.20.118:8080/login?from=%2F/");
   
   
   
	  Driver.findElement(By.id("j_username")).sendKeys("neerajbhartiya");
	  Driver.findElement(By.name("j_password")).sendKeys("password@123");

	  Driver.findElement(By.name("Submit")).click();
}
}
