import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Addtocart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();
		
          Actions act = new Actions(driver);
		
		//Min Slider
		
	/*	WebElement minslider = driver.findElement(By.xpath("//span[@aria-label='ngx-slider']"));
		System.out.println("Default Location of the min slider:"+ minslider.getLocation());
		act.dragAndDropBy(minslider,50,50).perform();
		System.out.println("Location of the min slider after moving:" + minslider.getLocation());
		*/
		//driver.findElement(By.xpath("//input[@name='01JY5H1F7AFF1EHC9DV6TKX6JD']")).click();
		
        driver.findElement(By.xpath("//img[@alt='Combination Pliers']")).click();
		driver.findElement(By.xpath("//button[@id='btn-increase-quantity']")).click();
		driver.findElement(By.xpath("//button[@id='btn-add-to-cart']")).click();
		driver.findElement(By.xpath("//a[@aria-label='cart']//fa-icon[@class='ng-fa-icon px-1']")).click();
		WebElement Qut =driver.findElement(By.xpath("//input[@id='quantity-01jy70gnbj91tkx357xhxqvkhw']"));
		Qut.clear();
		Qut.sendKeys("6");
		driver.findElement(By.xpath("//div[@class='float-end ng-star-inserted']//button[@type='button'][normalize-space()='Proceed to checkout']")).click();
		
		
			

	}

}
