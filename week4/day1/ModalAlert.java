package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//simple dialog
		WebElement simplealert=driver.findElement(By.xpath("(//span[text()='Show'])"));
		System.out.println("Simple alert text==="+ simplealert.getText());
		simplealert.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//confirm dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.accept();
		
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();

		
		//prompt dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Mathi");
		alert.accept();
		
		Thread.sleep(4000);
		//sweet alert-delete
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		//maxi & mini
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-maximize')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-minimize')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		
		//sweet alert
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::a")).click();
				
		
		
		
		
	}

}
