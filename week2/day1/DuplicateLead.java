package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demo");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saru");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mathi");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saru");

driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("NON-IT");
driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("abc@gmail.com");

driver.findElement(By.name("description")).sendKeys("description typed");
driver.findElement(By.className("smallSubmit")).click();

String title=driver.getTitle();
System.out.println(title);

driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
driver.findElement(By.xpath("//input[@value='Demo']")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demo.Net");

driver.findElement(By.xpath("//input[@value='Saru']")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharu");

driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

System.out.println(driver.getTitle());
	

}}
