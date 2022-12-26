package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement windows = driver.findElement(By.xpath("//span[text()='Open']"));
		System.out.println("window bfr switching==="+ driver.getTitle());
		windows.click();
		Set<String> handles = driver.getWindowHandles();
		for(String window:handles) {System.out.println(window);}
		System.out.println("No of windows opened=="+ handles.size());
		List<String> list = new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		System.out.println("window aftr switching==="+ driver.getTitle());
		driver.close();
		driver.switchTo().window(list.get(0));
		
	    WebElement windows1 = driver.findElement(By.xpath("//span[text()='Close Windows']/parent::button"));
	    System.out.println(" Parent window==="+ driver.getTitle());
		windows1.click();
		Set<String> handle = driver.getWindowHandles();
		System.out.println("No of windows opened=="+ handle.size());
		List<String> lists = new ArrayList<String>(handle);
		for(int i=1;i<handle.size();i++) {
		driver.switchTo().window(lists.get(i));
		System.out.println( " Child Windows title=== "+ driver.getTitle());
		driver.close();}
		driver.switchTo().window(list.get(0));
		
		WebElement window2 = driver.findElement(By.xpath("//span[text()='Open Multiple']"));
		window2.click();
		Set<String> handle2 = driver.getWindowHandles();
		System.out.println("No of opened tabs=="+ handle2.size());
		List<String> list2 = new ArrayList<String>(handle2);
		for(int i=1;i<handle2.size();i++) {
			driver.switchTo().window(list2.get(i));
			driver.close();}
		driver.switchTo().window(list.get(0));
	
		WebElement window3 = driver.findElement(By.xpath("//span[text()='Open with delay']/parent::button"));
		window3.click();
		Set<String> handle3 = driver.getWindowHandles();
		System.out.println("No of tabs opened after delay=="+ handle3.size());
		driver.quit();
		
	}

}
