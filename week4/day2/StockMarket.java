package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StockMarket {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]"));
		List<String> list=new ArrayList<String>();
		
		for(WebElement check:table) {
			String data=check.getText();
			list.add(data);}
		int no1=list.size();
		System.out.println("row size in 3rd colmn(list)="+no1 );
		System.out.println("row list are====="+list);
		
		Set<String> cross= new HashSet<String>(list);
		int no2=cross.size();
		System.out.println("row size in 3rd colmn(set)="+ no2);
		System.out.println("row data in set are="+cross);
		
		if(no1==no2) {System.out.println("result ===== no duplicates");}
		else {System.out.println("result ===== duplicates found");}
		
		
		
	}

}
