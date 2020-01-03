package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recordpreproduct {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://live.demoguru99.com/");
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/a")).click();
    driver.findElement(By.linkText("Log In")).click();
    
    driver.findElement(By.id("email")).sendKeys("Niyamital.123@xlm.com");
    driver.findElement(By.id("pass")).sendKeys("59fddf");
    driver.findElement(By.id("send2")).click();
    
    driver.findElement(By.className("link-reorder")).click();
    
    driver.findElement(By.className("input-text qty")).clear();
    driver.findElement(By.className("input-text qty")).sendKeys("10");
    driver.findElement(By.linkText("Update")).click();
    
    driver.findElement(By.linkText("PROCEED TO CHECKOUT")).click();
    
    driver.findElement(By.id("billing:use_for_shipping_yes")).click();
    
    driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button")).click();
    
    driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
    
    driver.findElement(By.name("payment[method]")).click();
    driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button")).click();
    
    driver.findElement(By.xpath("//*[@id=\"review-buttons-container\"]/button")).click();
    
    String actualUrl = "http://live.demoguru99.com/index.php/checkout/onepage/success/";
    String expectedUrl = driver.getCurrentUrl();
    System.out.println("actualUrl-->"+driver.getCurrentUrl());
    
    if(actualUrl.equals(expectedUrl)) {
 	   System.out.println("Pass");
    }
    else {System.out.println("Fail");}
    
    driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[3]/a")).click();
    
    driver.findElement(By.className("action-button")).click();
    
}
}
