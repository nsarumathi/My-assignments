package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableJQ {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		Actions act =new Actions(driver);
		WebElement frame=driver.findElement(By.xpath("//div[@id='content']/iframe"));
		Point p1=frame.getLocation();
		System.out.println("Point1(x,y)::"+p1);
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Point p2=ele.getLocation();
		System.out.println("Point2(x,y)::"+p2);
		
		Thread.sleep(4000);
		act.clickAndHold(ele).moveByOffset(-50, -100).release().perform();
		Point p3=ele.getLocation();
		System.out.println("Point2(x,y) after minimize::"+p3);
		
		Thread.sleep(4000);
		act.clickAndHold(ele).dragAndDropBy(ele, 200, 100).build().perform();
		Point p4=ele.getLocation();
		System.out.println("Point2(x,y) after maximize::"+p4);
		
		
		
		
		
	}

}
