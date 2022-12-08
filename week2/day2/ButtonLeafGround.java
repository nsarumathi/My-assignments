package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonLeafGround {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("ht"
			+ "tps://www.leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	//Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle()+"==Title");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
	//Confirm if the button is disabled
	WebElement Check=driver.findElement(By.id("j_idt88:j_idt92"));
	if(Check.isEnabled()) {System.out.println("button is enabled");}
	else { System.out.println("button is disabled");}
	
	//Find the position of the Submit button
	WebElement Position=driver.findElement(By.id("j_idt88:j_idt94"));
	System.out.println(Position.getLocation() +"-Position");
	
	//Find the Save button color
	System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
	
	//Find the height and width of this button
	WebElement Size=driver.findElement(By.name("j_idt88:j_idt98"));
	System.out.println(Size.getSize() +"--Size(width Height)");
	
	//Mouse over and confirm the color changed
	System.out.println(driver.findElement(By.name("j_idt88:j_idt100")).getCssValue("background"));
	Thread.sleep(5000);
	WebElement ColorChange=driver.findElement(By.name("j_idt88:j_idt100"));
	Thread.sleep(5000);
	Actions Hover=new Actions(driver);
	Hover.moveToElement(ColorChange).perform();
	System.out.println(driver.findElement(By.xpath("//span[text()='Success']")).getAttribute("style"));
	
	//How many rounded buttons are there?
	List<WebElement> list =driver.findElements(By.xpath("//button[contains(@class,'only rounded')]"));
	System.out.println(list.size()+": no of only rounded buttons");
	System.out.println("rounded button list : ");
	 for(WebElement options:list) 
		 System.out.println( options.getText());

	//Click Image Button and Click on any hidden button
	driver.findElement(By.xpath("//span[text()='Image']")).click();
	WebElement Check1=driver.findElement(By.xpath("//input[@type='hidden']"));
	System.out.println(Check1.isDisplayed());
	Thread.sleep(5000);
	driver.executeScript("arguments[0].click();",Check1);

	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("document.getElementById('j_id1:javax.faces.ViewState:4').click()");
}
}
