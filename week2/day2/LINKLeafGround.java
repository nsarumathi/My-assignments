package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINKLeafGround {
	public static void main(String[] args) throws InterruptedException {	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/link.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
  driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).click();
   String Org=driver.getTitle();
   System.out.println("ORG Title ==" +Org);
   Thread.sleep(5000);
   driver.navigate().back();
   Thread.sleep(5000);
   
  WebElement A=driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[2]"));
  System.out.println("href==="+ A.getAttribute("href"));
  
  WebElement Broken =driver.findElement(By.xpath("//a[text()='Broken?']"));
  Broken.click();
  String MSG=driver.getTitle();
  System.out.println("Broken Page"+ MSG);
  Thread.sleep(5000);
  driver.navigate().back();
  Thread.sleep(5000);
  
 
  driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[3]")).click();
  String Duplicate=driver.getTitle();
  System.out.println("Duplicate Title =="+Duplicate);
  if(Duplicate.equals(Org)) {System.out.println("it is an Duplicate link");}
  else { System.out.println("not an Duplicate link");}
  Thread.sleep(5000);
  driver.navigate().back();
  Thread.sleep(5000);
  
  
  List<WebElement> Count=driver.findElements(By.tagName("link"));
  System.out.println("Count of links::"+ Count.size());
  
  List<WebElement> Layot=driver.findElements(By.xpath("//a[text()='How many links in this layout?']"));
  System.out.println("Count of links::"+ Layot.size());
  
  
  
  }}
