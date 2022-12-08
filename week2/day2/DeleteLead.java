package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
    
    WebElement Phone=driver.findElement(By.xpath("//span[text()='Phone']"));
    driver.executeScript("arguments[0].click();", Phone);
    
    driver.findElement(By.name("phoneNumber")).sendKeys("98");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    

    WebElement List=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"));
    System.out.println(List.getText());
    Thread.sleep(5000);
	List.click();
	
 //delete icon in view lead is not available..so half done
}}
