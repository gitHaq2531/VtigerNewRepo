package selenpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition 
{
	public static void main(String[] args) throws InterruptedException
	{
		String s="my.name,is/afzaul haque";
		String[] arr=s.split("[.,/ ]");
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i];
			
			if(word.equals("afzaul"))
			{
				for(int j=word.length()-1;j>=0;j--)
				{
					System.out.print(word.charAt(j));
				}
			}
			else
			{
				System.out.print(word);
			}
			System.out.print(" ");
		}
		
	}
}