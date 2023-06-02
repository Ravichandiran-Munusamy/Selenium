package org.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screnshot {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.moneycontrol.com/");
	driver.manage().window().maximize();
	
	//create an object for mouse over
	Actions a = new Actions(driver);
	
	Thread.sleep(3000);
	
	WebElement market = driver.findElement(By.xpath("(//a[@title='Markets'])[1]"));
	a.moveToElement(market).perform();
	
	WebElement fo = driver.findElement(By.xpath("(//a[@title='F&O'])[1]"));
	fo.click();
	
	
}
}
