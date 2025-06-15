package CaptureScreenShoot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
    public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open URL & maximize window
		driver.get("https://practicesoftwaretesting.com/"); // Open Url 
		driver.manage().window().maximize(); //maximize window
		// full page screenshot
		/*
		   TakesScreenshot ts = (TakesScreenshot)driver;
           File sourcefile=ts.getScreenshotAs(OutputType.FILE);
           File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
           sourcefile.renameTo(targetfile);
          */
			// capture the screenshot of specific section
		/*
			WebElement featuredProducts =	driver.findElement(By.xpath("//img[@alt='Banner']"));
			File sourcefile =  featuredProducts.getScreenshotAs(OutputType.FILE);
			File targetfile=new File (System.getProperty("user.dir")+"\\screenshot\\featredproducts.png");
			sourcefile.renameTo(targetfile);
			*/
		// capture the screenshot of webelement
		  WebElement logo	= driver.findElement(By.xpath("//a[@title='Practice Software Testing - Toolshop']//*[name()='svg']"));
		   File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		   File targetfile = new File (System.getProperty("user.dir")+ "\\screenshot\\logo.png") ;
		   sourcefile.renameTo(targetfile);
	}

}
