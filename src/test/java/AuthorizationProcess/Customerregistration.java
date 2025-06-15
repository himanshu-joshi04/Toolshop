package AuthorizationProcess;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Customerregistration {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicesoftwaretesting.com/auth/register");
		driver.manage().window().maximize();

		

		// Proceed with registration if age >= 18
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Himanshu");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Joshi");
		
		// Input Date of Birth
				String dobString = "01/05/2000";  // MM/dd/yyyy format
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				LocalDate dob = LocalDate.parse(dobString, formatter);

				// Calculate age
				LocalDate today = LocalDate.now();
				int age = Period.between(dob, today).getYears();

				if (age < 18) {
					System.out.println("User is under 18 years old. Registration aborted.");
					driver.quit();  // exit the test
					return;
				}
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dobString);
		driver.findElement(By.xpath("//input[@id='street']")).sendKeys("Mandor Road Jodhpur");
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("342001");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Jodhpur");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Rajasthan");

		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		new Select(country).selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9782017696");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("joshii@mailinator.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Happy4646@");
		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
		
		WebElement thankYouMessage = driver.findElement(By.xpath("//h3[normalize-space()='Login']")); // ya By.xpath or By.cssSelector

		// Check message is displayed
		if(thankYouMessage.isDisplayed()) {
		    String actualText = thankYouMessage.getText();
		    if(actualText.equals("Login")) {
		        System.out.println("PASS: Thank you message validated successfully.");
		    } else {
		        System.out.println("FAIL: Message text mismatch. Found: " + actualText);
		    }
		} else {
		    System.out.println("FAIL: Thank you message not displayed.");
		}
		
		
	}
}
