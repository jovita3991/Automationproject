package mobileapplication;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcart {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://live.demoguru99.com/");
		driver.findElement(By.className("level0 ")).click();
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).clear();	    
	    driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).sendKeys("1000");	
	    driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
	   	
	    
	    driver.findElement(By.xpath("//*[@id=\"empty_cart_button\"]")).click();
	    
	    
	    String actualUrl = "http://live.demoguru99.com/index.php/checkout/cart/";
	       String expectedUrl = driver.getCurrentUrl();
	       System.out.println("actualUrl-->"+driver.getCurrentUrl());
	       
	       if(actualUrl.equals(expectedUrl)) {
	    	   System.out.println("Pass");
	       }
	       else {System.out.println("Fail");}
	      
	       driver.close();
		
		
	}

}
