package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerFormat {
	
	// selecting future date
	   static void selectFutureDate(WebDriver driver, String year, String month, String date)
	   {
		   while(true)
		   {
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currenyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();  
			
			if(currentmonth.equals(month) && currenyear.equals(year))
			{
					break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next

		   }
		   
		 List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
	   
	        for(WebElement dt: allDates)
	        {
	        	if(dt.getText().equals(date))
	        	{
	        		dt.click();
	        		break;
	        		
	        	}

	        }
	     }
	   
	  public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
        
		//Switch to frame
		driver.switchTo().frame(0);
				
		//Method1: using sendkeys()
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2026");
		
		//Method2 Using datepicker
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		String year="2022";
		String month="May";
		String date="10";
		selectFutureDate(driver,year,month,date);
		//selectpastdate(driver,year,month,date);
			
	}

}
