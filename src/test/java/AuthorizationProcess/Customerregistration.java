package AuthorizationProcess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customerregistration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// open URL & maximize window
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practicesoftwaretesting.com/auth/register");
    driver.manage().window().maximize();
    
    // customer registration first & last name fill
    
     driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Himanshu"); // First Name 
     driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Joshi"); // Last Name
     
     //driver.findElement(By.xpath("//input[@id='dob']")).click();
     driver.findElement(By.xpath("//svg[contains(@class, 'calendar-icon')]")).click();
     
    

	}

}
