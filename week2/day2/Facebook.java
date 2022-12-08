package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
		driver.findElement(By.name("lastname")).sendKeys("Demo");
		driver.findElement(By.name("reg_email__")).sendKeys("9841235678");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Abc@123");
		
		WebElement Date=driver.findElement(By.id("day"));
		if(Date.isDisplayed() && Date.isEnabled() ) {
			Select info=new Select(Date);
			info.selectByIndex(0);}
		
		WebElement month=driver.findElement(By.id("month"));
		Select info1=new Select(month);
		info1.selectByValue("10");
		
		WebElement year=driver.findElement(By.id("year"));
		Select info2=new Select(year);
		info2.selectByVisibleText("2000");
		
		WebElement Check=driver.findElement(By.xpath("//input[@type='radio']"));
		Check.click();
		boolean D=Check.isSelected();
		System.out.println(" radio button is selected/not: "+ D);
		
		
	}

}
