package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InputLeafGround {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Type your name
		driver.findElement(By.name("j_idt88:name")).sendKeys("Mathi");

		//Append Country to this City.
		WebElement Append=driver.findElement(By.xpath("//input[@value='Chennai']"));
		Append.clear();
		Append.sendKeys("Chennai,India");

		//Verify if text box is disabled
		WebElement Check=driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean C=Check.isEnabled();
		System.out.println(C +"=Enabled");

		//Clear the typed text.
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();

		//Retrieve the typed text.
		WebElement Retrieve=driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println(Retrieve.getAttribute("value"));

		//Type email and Tab. Confirm control moved to next element.
		WebElement Tab=driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		Tab.sendKeys("abc@gmail.com");
		Tab.sendKeys(Keys.TAB);

		//Type about yourself
		driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("I am Career Oriented Person");

		//Just Press Enter and confirm error message*
		WebElement Text=driver.findElement(By.id("j_idt106:thisform:age"));
		Text.sendKeys(Keys.ENTER);
		String MSG=driver.findElement(By.id("j_idt106:thisform:j_idt110")).getText();
		String err="Age is mandatory";
		if(MSG.equals(err)) {System.out.println("err msg is displayed");}
		else { System.out.println( "err msg is  not displayed");}

		//Click and Confirm Label Position Changes
		WebElement Location=driver.findElement(By.xpath("//input[@id='j_idt106:float-input']/following::label"));
		Point org= Location.getLocation();
		System.out.println(org);
		driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		Point change= Location.getLocation();
		System.out.println(change);
		if(org.equals(change)) {System.out.println("location is not changed");}
		else { System.out.println( "location is changed");}

		//Type your name and choose the third option
		driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[3]")).sendKeys("Mathi");
		WebElement Name=driver.findElement(By.xpath("(//li[contains(@data-item-value,'Mathi')])[4]"));
		Name.click();

		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[4]")).sendKeys("1/4/2000");
		WebElement Day=driver.findElement(By.xpath("(//td//a)[4]"));
		Day.click();
        
        //Type random number (1-100) and confirm slider moves correctly
	    String first=driver.findElement(By.xpath("//div[contains(@style,'width')]")).getAttribute("style");
	    System.out.println(first);
    
        driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[6]")).sendKeys("40");
        String next=driver.findElement(By.xpath("//div[contains(@style,'width')]")).getAttribute("style");
        System.out.println(next);
        if(first.equals(next)) {System.out.println("Slider is not moving");}
        else{System.out.println("Slider is moving");}
        
	}
}
