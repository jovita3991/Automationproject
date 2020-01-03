package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compareproduct {
	public static void main(String args[]) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		
		driver.get("http://live.demoguru99.com/");
		driver.findElement(By.className("level0 ")).click();
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//button[@title='Compare']")).click();
		
		String Mobile1 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();  
	    String Mobile2 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText(); 
	    System.out.println("Mobile1 = "+Mobile1);
	    System.out.println("Mobile2 = "+Mobile2);
        
	    driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	    
	}
	
}
