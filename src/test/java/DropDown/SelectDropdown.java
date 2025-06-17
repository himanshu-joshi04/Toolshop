package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Open URL & Maximize Window
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//Select option from the dropdown
		//drpCountry.selectByVisibleText("India");
		//drpCountry.selectByValue("India");
		//drpCountry.selectByIndex(2);
       
		//capture the options from the dropdown
       List<WebElement> options=drpCountry.getOptions();
       System.out.println("Number of options in a drop down:"+ options.size());
       
       // Printing the options
       for (WebElement op:options)
       {
    	   System.out.println(op.getText());
       }
	}

}
