package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Userverification {
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
        
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
        
        
        driver.findElement(By.linkText("MY WISHLIST")).click();
        driver.findElement(By.className("button btn-cart")).click();
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")).click();
        
        
        driver.findElement(By.id("billing:street1")).sendKeys("K D Road");
        driver.findElement(By.id("billing:city")).sendKeys("Delhi");
        
        Select drpState = new Select (driver.findElement(By.id("billing:region_id")));
        drpState.selectByVisibleText("Florida");
        
        driver.findElement(By.name("billing[postcode]")).sendKeys("43567");
        
        Select drpCountry = new Select (driver.findElement(By.name("billing[country_id]")));
        drpState.selectByVisibleText("Togo");
        
        driver.findElement(By.name("billing[telephone]")).sendKeys("890743567");
        driver.findElement(By.className("button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        
        
       driver.findElement(By.name("payment[method]")).click();
       driver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"payment-buttons-container\"]/button")).click();
       driver.findElement(By.className("button btn-checkout")).click();
       
       String actualUrl = "http://live.demoguru99.com/index.php/checkout/onepage/success/";
       String expectedUrl = driver.getCurrentUrl();
       System.out.println("actualUrl-->"+driver.getCurrentUrl());
       
       if(actualUrl.equals(expectedUrl)) {
    	   System.out.println("Pass");
       }
       else {System.out.println("Fail");}
       
       driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[3]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"sidebar\"]//print-preview-button-strip//cr-button[1]")).click();
	   
	   driver.close();
	}
}
