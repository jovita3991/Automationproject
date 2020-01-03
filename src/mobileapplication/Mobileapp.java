package mobileapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//Github
public class Mobileapp {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://live.demoguru99.com/");
        
        
        String actualTitle ="Home page";
        String expectedTitle = driver.getTitle();
        if(expectedTitle.contentEquals(actualTitle)) {
	    	System.out.println("pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
        System.out.println("Actualtitle--->"+driver.getTitle());
       driver.findElement(By.className("level0")).click();
        
       new Select(driver.findElement(By.cssSelector("select[title=\"Sort By\"]"))).selectByVisibleText("Name");
       
       
       String actualUrl = "http://live.demoguru99.com/index.php/mobile.html?dir=asc&order=name";
       String expectedUrl = driver.getCurrentUrl();
       System.out.println("actualUrl-->"+driver.getCurrentUrl());
       
       if(actualUrl.equals(expectedUrl)) {
    	   System.out.println("Pass");
       }
       else {System.out.println("Fail");}
      
       //.click();driver.close();
	}
}