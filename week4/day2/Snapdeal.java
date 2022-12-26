package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Date now=new Date();
		String date=now.toString().replace(" ", "-").replace(":","-")+".png";
		System.out.println(date);
		
		WebElement Men = driver.findElement(By.xpath("//span[contains(text(),'Men')]/ancestor::li"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Men).perform();
		
		WebElement Shoe = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		act.click(Shoe).contextClick().perform();
		
		List<WebElement> total = driver.findElements(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div"));
		System.out.println("No of Shoes==="+ total.size());
			
		WebElement training = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
	   act.click(training).contextClick().build().perform();
	   List<WebElement> total2 = driver.findElements(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div"));
	   System.out.println("No of training shoes=="+ total2.size());
	   
	   Thread.sleep(2000);
	   List<WebElement> pricebfr = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span[2]"));
	   List<String> list=new ArrayList<String>();
	   for(WebElement prc:pricebfr) 
	   { String bfr=prc.getText();
		   list.add(bfr);}
	   System.out.println(" training shoes bfr sorting===");
	   System.out.print(list);
	     
	  driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/i")).click();
	  
	  WebElement sort=driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]"));
	  driver.executeScript("arguments[0].click();",sort);
	  
	   Thread.sleep(2000);
	   List<WebElement> priceaftr = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span[2]"));
	   List<String> list1=new ArrayList<String>();
	   for(WebElement prc:priceaftr) 
	   { String bfr=prc.getText();
		   list1.add(bfr);}
	   System.out.println(" \n " + "training shoes after sorting===");
	   System.out.print(list1);
	   
	   List<WebElement> filt = driver.findElements(By.xpath("//div//a[contains(@class,'clear-filter-pill')]"));  
	   Set<WebElement> check=new HashSet<WebElement>(filt);
	   if(check.size()==0) {
	   System.out.println(" \n  " + "Before filters applied==="+ check.size());}
	   
	   WebElement from= driver.findElement(By.xpath("//input[@name='fromVal']"));
	   act.moveToElement(from).build().perform();from.clear();from.sendKeys("500");
	   WebElement to=driver.findElement(By.xpath("//input[@name='toVal']"));
	   act.moveToElement(to).build().perform();to.clear();to.sendKeys("650");
	   driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
	   
	   List<WebElement> range = driver.findElements(By.xpath("//div[@class='lfloat marR10']/span[2]"));
	   List<String> list3=new ArrayList<String>();
	   for(WebElement prc:range) {
		   String a=prc.getText();list3.add(a);}
	   System.out.println("Shoes within 500-600 range=="+list3);
	   
	   Thread.sleep(2000);
	   WebElement color= driver.findElement(By.xpath("//div//label[@for='Color_s-Navy']"));
	   act.moveToElement(color).build().perform();
	   driver.executeScript("arguments[0].click();", color);
	
	   Thread.sleep(4000);
	   List<WebElement> filter = driver.findElements(By.xpath("//div[@class='filters-top-selected']//div[@class='navFiltersPill']"));  
	   List<String> aftr=new ArrayList<String>();  
	   for(WebElement check1:filter) {
		   String b=check1.getText();
		   aftr.add(b);}
	   System.out.println("No of filters in list=="+ aftr.size());
	   System.out.println("After filters applied ===");
	   System.out.println(aftr);
	
	   Thread.sleep(2000);
	   WebElement first = driver.findElement(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div"));
	   act.moveToElement(first).build().perform();
	   
	   WebElement view = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
	   act.click(view).contextClick().perform();
		
	   Thread.sleep(2000);
		WebElement details = driver.findElement(By.xpath("//a[@class=' btn btn-theme-secondary prodDetailBtn']"));
		act.click(details).contextClick().perform();
	
		WebElement shoeprc = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println("price of 1st shoes=="+ shoeprc.getText());
		
		WebElement percentage = driver.findElement(By.xpath("//span[@class='pdpDiscount ']"));
		System.out.println("percentage of 1st shoes=="+ percentage.getText());
		
		 WebElement img = driver.findElement(By.xpath("(//div[@class='pdp-comp comp-product-carousel left-imagepanel']//img)[6]"));
		 Thread.sleep(2000);
		 File Source=img.getScreenshotAs(OutputType.FILE);
		 File Dest=new File(".//snap/assignment/snapdeal"+date);
		 FileUtils.copyFile(Source, Dest);
		 
		Thread.sleep(2000);
		driver.quit();
			 
		 
			
			
		/* List<WebElement> imgs = driver.findElements(By.xpath("//div[@class='pdp-comp comp-product-carousel left-imagepanel']//img"));
	          System.out.println("total no of images=="+imgs.size());
		      for(int i=1;i<imgs.size()-5;i++) {
			 Thread.sleep(2000);
			 File Src=(driver.findElement(By.xpath("(//div//img[@title='TUFF 5005 Navy Training Shoes'])["+ i +"]"))).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 File Des=new File(".//snap/assignment/snapdeal"+date);
			 FileUtils.copyFile(Src, Des);}
		 
	
	   WebElement Shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		act.click(Shirts).contextClick().perform();
		
		WebElement first = driver.findElement(By.xpath("//section[@class='js-section clearfix dp-widget dp-fired']/div"));
		act.moveToElement(first).build().perform();
		
		WebElement view = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
		act.click(view).contextClick().perform();
		
		WebElement details = driver.findElement(By.xpath("//a[@class=' btn btn-theme-secondary prodDetailBtn']"));
		act.click(details).contextClick().perform();
		Thread.sleep(3000);
		
		 //take screenshot
		 File Source=driver.getScreenshotAs(OutputType.FILE);
		 File Dest=new File(".//snap/snapdeal.png");
		 FileUtils.copyFile(Source, Dest);*/

}}
