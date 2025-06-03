package selenpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseQuitMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(30000);
		d.findElement(By.id("compare")).click();
		Thread.sleep(30000);
		d.quit();
		}
}
