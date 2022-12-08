package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	
	WebElement Name=driver.findElement(By.xpath("//input[@id='firstNameField']"));
	Name.sendKeys("saru");
	System.out.println(Name.getAttribute("value"));
	
	driver.findElement(By.xpath("(//input[contains(@name,'last')])[3]")).sendKeys("mathi");
	driver.findElement(By.name("submitButton")).click();
	
	System.out.println(driver);
	driver.close();

}}
