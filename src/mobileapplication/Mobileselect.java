package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobileselect {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		driver.get("http://live.demoguru99.com/");
		driver.findElement(By.className("level0")).click();
		
		String CostSonyXperia = driver.findElement(By.cssSelector("span#product-price-1")).getText();
		
		driver.findElement(By.id("product-collection-image-1")).click();
		
		String detailPrice = driver.findElement(By.cssSelector("span.price")).getText();
		
		if(CostSonyXperia.equals(detailPrice)) {
	    	   System.out.println("Pass");
	       }
	       else {System.out.println("Fail");}
		
		
	}

}
