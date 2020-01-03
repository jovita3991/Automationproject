package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifypreorder {
	
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
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")).click();
		
        driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/span/a[1]")).click();
        
        String actualUrl = "http://live.demoguru99.com/index.php/sales/order/view/order_id/10529/";
        String expectedUrl = driver.getCurrentUrl();
        System.out.println("actualUrl-->"+driver.getCurrentUrl());
        
        if(actualUrl.equals(expectedUrl)) {
     	   System.out.println("Pass");
        }
        else {System.out.println("Fail");}
        
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")).click();
        
        driver.findElement(By.className("action-button")).click();

}		
			
}
