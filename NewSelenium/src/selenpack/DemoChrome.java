package selenpack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class DemoChrome 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/search?q=iphone");
		List<WebElement> element = driver.findElements(By.cssSelector("div[class='XQDdHH']"));
		System.out.println(element.size());
		for(WebElement ele: element)
		{
			String text=ele.getText();
			//System.out.println(text);
			double rating=Double.parseDouble(text);
			if(rating == 4.6)
			{
			System.out.println(rating);	
			}
		}
		System.out.println("done");
		
	}
	
}
