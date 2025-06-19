package AuthorizationProcess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileUpdate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicesoftwaretesting.com/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshihh8@mailinator.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Happy4646@");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.xpath("//a[@routerlink='profile']")).click();
        
        //FirstName Update
        Thread.sleep(3000);
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstname.clear();
        firstname.sendKeys("Ranju");
         
       // LastName Update
      
        Thread.sleep(3000);
        WebElement lastname = driver.findElement(By.xpath(" //input[@id='last_name']"));
        lastname.clear();
        lastname.sendKeys("Bhargava");
      
        
        //Phone No Field Update
        
        Thread.sleep(3000);
        WebElement phoneno = driver.findElement(By.xpath("  //input[@id='phone']"));
        phoneno.clear();
        phoneno.sendKeys("1234567891");
        
        // Update Address Field 
        
        Thread.sleep(3000);
        WebElement street = driver.findElement(By.xpath("//input[@id='street'] "));
        street.clear();
        street.sendKeys("Mandor");
        
        Thread.sleep(3000);
        WebElement postal = driver.findElement(By.xpath("//input[@id='postal_code'] "));
        postal.clear();
        postal.sendKeys("342001");
        
        Thread.sleep(3000);
        WebElement city = driver.findElement(By.xpath(" //input[@id='city']   "));
        city.clear();
        city.sendKeys("Pune");
        
        Thread.sleep(3000);
        WebElement state = driver.findElement(By.xpath(" //input[@id='state']   "));
        state.clear();
        state.sendKeys("Pune");
        
        Thread.sleep(3000);
        WebElement country = driver.findElement(By.xpath(" //input[@id='country']   "));
        country.clear();
        country.sendKeys("India");
     
        
     driver.findElement(By.xpath("//button[normalize-space()='Update Profile']")).click(); 
     
     
      

	}

}
