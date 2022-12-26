package week4.day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
public static void main(String[] args) throws InterruptedException, IOException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("-disable-notifications");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://www.myntra.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Date now=new Date();
	String date=now.toString().replace(" ", "-").replace(":","-")+".png";
	System.out.println(date);
	
	Actions act=new Actions(driver);
	WebElement Men = driver.findElement(By.xpath("//a[text()='Men']"));	
	act.moveToElement(Men).perform();
	WebElement jack = driver.findElement(By.xpath("//a[text()='Jackets']"));
	act.click(jack).contextClick().perform();
	String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
	System.out.println("Total no of items==="+ text);
	
	
	List<WebElement> list=driver.findElements(By.xpath("//span[@class='categories-num']"));
	System.out.println("Categories are==");
	for(WebElement each:list) {System.out.println(each.getText());}
	String cat1=driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
	String cat2=driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
	
	String a1=cat1.replaceAll("[()]"," ").trim();
	String a2=cat2.replaceAll("[()]"," ").trim();
	String nos=text.replaceAll("[^0-9]"," ").trim();
	int i=Integer.parseInt(a1);int j=Integer.parseInt(a2);int a=Integer.parseInt(nos);
	System.out.println("category-1 items="+i);System.out.println("category-2 items="+j);System.out.println("Total items="+a);
	int total=i+j;
	if(total==a) {System.out.println("Result::Categories sum is matches with total items");}
	else {System.out.println("Result::not matched");}
	
	driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
	driver.findElement(By.xpath("//div[@class='brand-more']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
	driver.findElement(By.xpath("//label[@class=' common-customCheckbox']")).click();
	driver.findElement(By.xpath("//span[contains(@class,'close sprites-remove')]")).click();
	
	Thread.sleep(3000);
	List<WebElement> brandlist = driver.findElements(By.xpath("//h3[@class='product-brand']"));
	List<String> brand= new ArrayList<String>();
	for(WebElement each:brandlist){
		String check=each.getText();
		brand.add(check);}
	System.out.println("list size="+brand.size());
	System.out.println("list==="+brand);
	if(brand.contains("Duke")) {System.out.println("Result::All items are in same brand-Duke");}
	else {System.out.println("Result::not an same brand");}
	
	driver.findElement(By.xpath("//span[contains(@class,'sort-downArrow')]")).click();
	driver.findElement(By.xpath("//input[@value='discount']/ancestor::li")).click();
	Thread.sleep(3000);
	String price=driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
	System.out.println("1st item price=="+ price);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	
	Set<String> handles = driver.getWindowHandles();
	List<String> window = new ArrayList<String>(handles);
	
	driver.switchTo().window(window.get(1));
	Thread.sleep(3000);
	File src=driver.getScreenshotAs(OutputType.FILE);
	File dest=new File(".//snap/assignment/myntra"+ date);
	FileUtils.copyFile(src, dest);
	
	//to add wishlist,need to login first
	driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-wishlist pdp-button')]")).click();
	driver.close();
	

	
	
		

	
}
}