package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Demo");
	
   WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
   Select dd=new Select(source);
   dd.selectByIndex(6);
   
    Thread.sleep(2000);
  
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saru");
  
    Thread.sleep(2000);
  dd.selectByValue("LEAD_EMPLOYEE");
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mathi");
  
    Thread.sleep(2000);
  dd.selectByVisibleText("Word of Mouth");
  
   }}
	
