package selenpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGet 
{
	public static void main(String[] args) 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
	}
}
