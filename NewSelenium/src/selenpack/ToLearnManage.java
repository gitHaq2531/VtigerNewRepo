package selenpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage 
{
	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
		d.manage().window().fullscreen();
	}
}
