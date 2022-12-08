package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) {
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
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Saru");
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
    driver.findElement(By.xpath("(//a[text()='Sarumathi'])[6]")).click();
    System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    driver.findElement(By.xpath("//input[@value='TestLeaf']")).clear();
    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Demo.Net");
    driver.findElement(By.className("smallSubmit")).click();
    System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
   
    driver.close();
    
	
	}}
