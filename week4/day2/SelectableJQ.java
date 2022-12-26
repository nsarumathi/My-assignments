package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableJQ {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver = new ChromeDriver();
	System.out.println(driver);
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement list=driver.findElement(By.xpath("//div[@id='content']"));
	driver.executeScript("arguments[0].scrollIntoView();",list);
	
	Actions act =new Actions(driver);
	driver.switchTo().frame(0);
	
	WebElement it1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement it3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement it6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
	WebElement it7 = driver.findElement(By.xpath("//li[text()='Item 7']"));

	
	act.clickAndHold(it1).moveToElement(it6).release().perform();
	
	act.keyDown(Keys.CONTROL).click(it3).click(it6).keyUp(Keys.CONTROL).perform();
	
	act.keyDown(Keys.CONTROL).click(it7).keyUp(Keys.CONTROL).perform();
	
	
	File element = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/jquery.png");
	FileUtils.copyFile(element, dest);
	
}
}
