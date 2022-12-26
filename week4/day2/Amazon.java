package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.click();search.sendKeys("oneplus 10 pro");
		
		driver.findElement(By.xpath("(//div[text()='oneplus 10 pro'])[1]")).click();
		
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("prices of 1st item=="+price.getText());
		
		String rating=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("No of Customers given ratings=="+ rating);
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2/a[@target='_blank']")).click();
			
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		File Source=driver.getScreenshotAs(OutputType.FILE);
		File Dest=new File(".//snap/assignment/amazon.png");
		FileUtils.copyFile(Source, Dest);
		//star mousehover 
		 WebElement star = driver.findElement(By.xpath("//div//span[@id='acrPopover']"));
		 act.moveToElement(star).click().build().perform();
		//star percentage
		 Thread.sleep(5000);
		 List<WebElement> percent = driver.findElements(By.xpath("//div[@class='a-popover-content']//tr[1]//td//a"));
		 List<String> starrate=new ArrayList<String>();
		 for(WebElement each:percent) {
			 String a=each.getText();
			 starrate.add(a);}
		 System.out.println("list size=="+list.size());
		 System.out.println("% of ratings from 5 stars=="+ starrate);
		//price
		 String total=driver.findElement(By.xpath("//div[contains(@class,'aok-align-center')]//span[2]")).getText();
		 System.out.println("price of phone=="+total);
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		//carttotal
		 Thread.sleep(5000);
		 WebElement cart=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		 Thread.sleep(5000);
		String	carttotal=cart.getText();
		System.out.println("Cart Total=="+carttotal);
		
		if(carttotal.contains(total)) {System.out.println("Reslt::same subtotal");}
		else {System.out.println("Reslt::not same subtotal");}
		}	
	}


/*		WebElement starc = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
act.moveToElement(starc).click().build().perform();

Thread.sleep(5000);
String ofReviews = driver.findElement(By.xpath("//td[@class='a-text-right a-nowrap']//a")).getText();
System.out.println(ofReviews);*/