package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.nykaa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(brands).release().perform();
		
		driver.findElement(By.xpath("//div[@class='SearchIcon']/following::input")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a")).click();
		System.out.println(driver.getTitle());
		System.out.println("title afteer brand==="+ driver.findElement(By.xpath("//div[@id='title']/h1")).getText());
		
		WebElement sort = driver.findElement(By.xpath("//span[@class='sort-name']"));
		driver.executeScript("arguments[0].scrollIntoView();",sort);
		driver.executeScript("arguments[0].click();",sort);
	
		WebElement customer =driver.findElement(By.xpath("(//label[@class='control control-radio'])[4]"));
		driver.executeScript("arguments[0].click();",customer);
		Thread.sleep(2000);
		System.out.println("title after rating==="+ driver.findElement(By.xpath("//h1")).getText());
		
		Thread.sleep(3000);
		WebElement category=driver.findElement(By.xpath("//span[text()='Category']"));
		act.click(category).contextClick().perform();
		driver.findElement(By.xpath("//div//span[text()='Hair']")).click();
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		driver.findElement(By.xpath("//li//div[@class='control-indicator checkbox ']")).click();
		Thread.sleep(2000);
		System.out.println("title after hair care==="+ driver.findElement(By.xpath("//h1")).getText());
		
		WebElement concern=driver.findElement(By.xpath("//div//span[text()='Concern']"));
		driver.executeScript("arguments[0].scrollIntoView();",concern);
		driver.executeScript("arguments[0].click();",concern);
		WebElement color=driver.findElement(By.xpath("//span[text()='Color Protection']"));
		driver.executeScript("arguments[0].scrollIntoView();",color);
		driver.executeScript("arguments[0].click();",color);
		Thread.sleep(2000);
		List<WebElement> filter = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for(WebElement list:filter) {
		System.out.println("Filters applied=="+ list.getText());}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='productWrapper css-xin9gt']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(handles);
		System.out.println("Total windows opened=="+ handles.size());
		driver.switchTo().window(list.get(1));
		System.out.println("New window title=="+driver.getTitle());
		WebElement size=driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select ss=new Select(size);
		ss.selectByVisibleText("340ml");
		
		WebElement prc = driver.findElement(By.xpath("//span[@class='css-1jczs19']"));
		System.out.println("price=="+ prc.getText());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=' css-12z4fj0']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement total = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
		driver.executeScript("arguments[0].scrollIntoView();",total);
		String no1 = total.getText();
		System.out.println("Grand Total in cart page=="+ no1);
		
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		WebElement grand = driver.findElement(By.xpath("//div[@class='css-14zx4vh e87w9871']/p"));
		String no2 = grand.getText();
		System.out.println("Total in shipping page=="+ no2);
		if(no1.equals(no2)) {
			System.out.println("Grand total is same");
			driver.quit();}
		
		}}
