package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableJQ {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Point p1=drag.getLocation();
		System.out.println("Point1(x,y)-DRAG::"+p1);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Point p2=drop.getLocation();
		System.out.println("Point2(x,y)-DROP::"+p2);
		
		act.clickAndHold(drag).dragAndDrop(drag, drop).build().perform();
		Point p3=drag.getLocation();
		System.out.println("Point1(x,y) after dragged::"+p3);
		
		act.clickAndHold(drag).dragAndDropBy(drag, -20, -15).build().perform();
		Point p4=drag.getLocation();
		System.out.println("Point1(x,y) after dragged to point::"+p4);
		
		
		
		
	}

}
