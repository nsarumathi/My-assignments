package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableJQ {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement it1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement it4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		int x=it4.getLocation().getX();
		int y=it4.getLocation().getY();
		WebElement it6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		int x1=it6.getLocation().getX();
		int y1=it6.getLocation().getY();
		WebElement it7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Thread.sleep(3000);
		act.clickAndHold(it7).dragAndDropBy(it4, x, y).perform();
		Thread.sleep(3000);
		act.clickAndHold(it1).dragAndDropBy(it6, x1, y1).perform();
	}

}
