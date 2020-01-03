package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Discountcoupon {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://live.demoguru99.com/");
		
		driver.findElement(By.className("level0 ")).click();
		
		driver.findElement(By.className("button btn-cart")).click();
		
		driver.findElement(By.id("coupon_code")).sendKeys("GURU50");
		driver.findElement(By.className("button2")).click();
	}
}
