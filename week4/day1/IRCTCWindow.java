package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWindow {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("window bfr switching==="+ driver.getTitle());
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> handles = driver.getWindowHandles();
		for(String window:handles) {System.out.println(window);}
		System.out.println("No of windows opened=="+ handles.size());
		List<String> list = new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		System.out.println("window aftr switching==="+ driver.getTitle());
		driver.switchTo().window(list.get(0));
		driver.close();
		
	}

}
