package AuthorizationProcess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileUpdate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicesoftwaretesting.com/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshih@mailinator.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Happy4646@");
		driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}
