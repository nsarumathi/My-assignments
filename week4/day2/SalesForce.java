package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get(" https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		System.out.println("total windows opened=="+ list.size());
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println("Title is==="+ driver.getTitle());
		driver.switchTo().window(list.get(0));
		driver.quit();
		
		
	}

}
