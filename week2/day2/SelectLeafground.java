package week2.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLeafground {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
 WebElement Tool=driver.findElement(By.className("ui-selectonemenu"));
 Select A=new Select(Tool);
 A.selectByVisibleText("Selenium");
 
 driver.findElement(By.xpath("//button[contains(@class,'ui-button')]")).click();
 driver.findElement(By.xpath("//li[@role='option']")).click();
 
//onchange event-lang
driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
driver.findElement(By.xpath("(//li[text()='Select Language']/following-sibling::li)[1]")).click();

// language chosen options
Thread.sleep(5000);
WebElement Check1=driver.findElement(By.xpath("//select[@id='j_idt87:value_input']"));
Select NOS=new Select(Check1);
List<WebElement> list1=NOS.getOptions();
System.out.println("nos based on lang are===");
System.out.println(list1.size());
for(WebElement Each:list1)
	{System.out.println(Each.getAttribute("value"));}

//Select No
driver.findElement(By.xpath("//div[@id='j_idt87:value']")).click();
driver.findElement(By.xpath("(//li[text()='Select Values']/following::li)[3]")).click();


//onchange event-cntry		
driver.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
WebElement cntry=driver.findElement(By.xpath("(//div//li[@role='option'])[4]"));
cntry.click();
System.out.println("contry selected are==="+ cntry.getText());

//cntry chosen options
Thread.sleep(5000);
WebElement Check=driver.findElement(By.xpath("//select[@id='j_idt87:city_input']"));
Select City=new Select(Check);
System.out.println("Cities belong to contry loaded are===");
List<WebElement> list=City.getOptions();
System.out.println(list.size());
for(WebElement Each:list)
{ System.out.println(Each.getAttribute("value"));}

//choose City

driver.findElement(By.xpath("//div[@id='j_idt87:city']")).click();
driver.findElement(By.xpath("//li[text()='Select City']/following::li")).click();

}}