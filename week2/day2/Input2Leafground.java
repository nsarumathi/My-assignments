package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input2Leafground {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	 ////Type number and spin to confirm value changed
	    WebElement Value=driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[5]"));
	    Value.sendKeys("10");
	    String Bfr=Value.getAttribute("aria-valuenow");
        driver.findElement(By.xpath("(//span[(@class='ui-button-text')])[3]")).click();
        String Aftr=Value.getAttribute("aria-valuenow");
        if(Aftr.equals(Bfr))
             {System.out.println(Aftr +":Spin button is not working");}
        else{System.out.println(Aftr +" : Spin button is working");}
	        
	 /////Type random number (1-100) and confirm slider moves correctly
		    WebElement No=driver.findElement(By.xpath("//span[contains(@style,'left')]"));
		    Point first=No.getLocation();
		    System.out.println(first);
		
	        driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[6]")).sendKeys("40");
	        WebElement No2=driver.findElement(By.xpath("//span[contains(@style,'left')]"));
	        Point next=No2.getLocation();
	        System.out.println(next);
	        if(first.equals(next)) {System.out.println("Slider is not moving");}
	        else{System.out.println("Slider is moving");}
	        
	  /////Click and Confirm Keyboard appears
	       WebElement No1 =driver.findElement(By.xpath("(//input[contains(@id,'j_idt106')])[7]"));
	       String A = No1.getAttribute("class");
	       System.out.println("BEFORE="+A);
	       No1.click();
	       String B = No1.getAttribute("class");
	       System.out.println("AFTER="+B);
	       if(A.contentEquals(B))
	       {System.out.println("Keypad is not hovering after click");}
	        else{System.out.println("Keypad is hovering after click");}
	       
	  
	}

}
