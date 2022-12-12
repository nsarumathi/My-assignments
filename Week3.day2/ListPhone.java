package week3.day2;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListPhone {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Price=driver.findElements(By.xpath("//span//span[@class='a-price-whole']"));
		System.out.println("No of phones with prices=="+ Price.size());
		
		List<String> Check =new ArrayList<String>();
	    for(WebElement Each:Price) {
	    	String Value=Each.getText();
	    	Check.add(Value);}
	    
	    System.out.println("Prices Before Sorting ::");
	    System.out.print(Check);
	    Collections.sort(Check);
	    System.out.println("   ");
	    
	    System.out.println("Prices After Sorting ::");
	    System.out.print(Check);
	    String First= Check.get(0);
	    System.out.println("   ");
	    
	    System.out.println("Lowest Price is==="+First);
	    int Count= Collections.frequency(Check, First);
	    System.out.println("Count of lowest prices is=="+Count);
	}
}
