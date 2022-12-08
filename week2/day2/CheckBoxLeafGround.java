package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxLeafGround {
	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/checkbox.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//Basic Checkbox & Notification
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	WebElement Notification=driver.findElement(By.xpath("//span[text()='Ajax']"));
	Notification.click();
	System.out.println("Notification is recieved as Checked-"+ Notification.isSelected());
	
//Choose your favorite language(s)
	List<WebElement> List=driver.findElements(By.xpath("//div[contains(@class,'ui-chkbox-box')]"));
	System.out.println("Checkbox List Size:" + List.size());
	for(int i=2;i<=List.size();i++) {
		if(i<7) {
     List.get(i).click();}}
	
//Tri State Checkbox
			
	WebElement TriState=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//span"));
	System.out.println("class Bfr click===="+TriState.getAttribute("class"));
	driver.executeScript("arguments[0].click();",TriState);
	System.out.println("class aftr click1===="+TriState.getAttribute("class"));
	TriState.click();
	System.out.println("class aftr click2===="+TriState.getAttribute("class"));
	
//Toggle Switch
	driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();

	
//Select Multiple
	driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
	List<WebElement> List2=driver.findElements(By.xpath("//ul//label"));
	System.out.println("Checkbox  Size:"+List2.size());
    for(WebElement Each:List2)
	   { String Options=Each.getText();
	   if (Options.contains("Paris")) { Each.click();}
	   if (Options.contains("Rome")) {Each.click();} }         
    

  //Verify if check box is disabled
  	WebElement Disable=driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
   System.out.println("Checkbox disable checked=="+Disable.isSelected());
  	
  

}}