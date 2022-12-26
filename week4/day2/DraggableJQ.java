package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableJQ {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		Point p1=frame.getLocation();
		System.out.println("Point1(x,y)::"+p1);
		
		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Point p2=drag.getLocation();
		System.out.println("Point2(x,y)::"+p2);
		
		act.clickAndHold(drag).dragAndDropBy(drag, 150, 150).build().perform();
		Point p3=drag.getLocation();
		System.out.println("Point2(x,y)- dragged to certain point::"+p3);
		
		
		
		
		
		
		
		
		
	}

}
