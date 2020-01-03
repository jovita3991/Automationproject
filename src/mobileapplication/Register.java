package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	
	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://live.demoguru99.com/");
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
	
    driver.findElement(By.linkText("Register")).click();


	driver.findElement(By.id("firstname")).sendKeys("Niyan");
		
	driver.findElement(By.id("lastname")).sendKeys("Mitalle");
		
	driver.findElement(By.name("email")).sendKeys("Niyamital.123@xlm.com");
		
	driver.findElement(By.name("password")).sendKeys("59fddf");
		
	driver.findElement(By.name("confirmation")).sendKeys("59fddf");
		
	driver.findElement(By.name("is_subscribed")).click();
		
	driver.findElement(By.xpath("//button[@title='Register']")).click();
	
	String actualUrl ="http://live.demoguru99.com/index.php/customer/account/index/";
    String expectedUrl = driver.getCurrentUrl();
    if(actualUrl.contentEquals(expectedUrl)) {
    	System.out.println("pass");
    }
    else {
    	System.out.println("Fail");
    }
    
    driver.findElement(By.className("level0 ")).click();
    driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/ul/li[1]/a")).click();
    
    driver.findElement(By.id("email_address")).sendKeys("customer.1@gm.com");
	
    driver.findElement(By.id("message")).sendKeys("hi had to get some information about the product");
		
    driver.findElement(By.xpath("//button[@title='Share Wishlist']")).click();
	}

}
