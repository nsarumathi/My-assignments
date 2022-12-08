package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementVerification {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//get attribute
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//get text & get tag name		
		WebElement Details=driver.findElement(By.linkText("CRM/SFA"));
		String text=Details.getText();
		String tagname=Details.getTagName();	
		String Attribute=Details.getAttribute("href");
		System.out.println("TEXT:"+text);
		System.out.println("TAGNAME:"+tagname);
		System.out.println("HREF:"+ Attribute);
		Details.click();
	
    //get CssValue
		System.out.println(driver.findElement(By.xpath("//div[@class='sectionTabBorder']")).getCssValue("background"));
		System.out.println(driver.findElement(By.xpath("//div[@class='sectionTabBorder']")).getCssValue("color"));
		
	//get Location & Size	
		driver.findElement(By.linkText("Leads")).click();
		WebElement Info=driver.findElement(By.linkText("Create Lead"));
		Point location=Info.getLocation();
		Dimension size=Info.getSize();
		System.out.println("LOCATION:"+location);
		System.out.println("SIZE:"+size);
		Info.click();
		
    //is Displayed
		System.out.println(driver.findElement(By.partialLinkText("Create")).isDisplayed());
		
	//is Enabled & is Displayed-Boolean
		WebElement Checking=driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		boolean A=Checking.isDisplayed();
		boolean B=Checking.isEnabled();
		if(A&&B){
			Checking.sendKeys("DEMO");}
			System.out.println("companyName is displayed :"+Checking.isDisplayed());
			System.out.println("companyName is enabled  :"+ Checking.isEnabled());
		
	//is Selected
		WebElement source=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		if(source.isDisplayed() && source.isEnabled()) {
			Select info=new Select(source);
			info.selectByIndex(6);}
		System.out.println(driver.findElement(By.xpath("//select[@name='industryEnumId']/option[7]")).isSelected()+"---Option7 is selected/not");
		System.out.println(driver.findElement(By.xpath("//select[@name='industryEnumId']/option[6]")).isSelected()+"---Option6 is selected/not");
		
	//Boolean type-is Selected
		WebElement Country=driver.findElement(By.xpath("//select[@name='generalCountryGeoId']/option"));
		Country.click();
		boolean D=Country.isSelected();
		System.out.println(" option in industry field is selected/not : "+ D);
}
}
