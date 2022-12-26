package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {
	public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("-disable-notifications");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("https://html.com/tags/table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	List<WebElement> rowdata=driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
	System.out.println("row size=="+rowdata.size());
	List<String> Lib=new ArrayList<String>();
	System.out.println("The rows are===");
	for(WebElement name:rowdata) {
	String Data=name.getText();
	System.out.println(Data);
	Lib.add(Data); }
	System.out.println("The rows in list form===");
	System.out.println(Lib);
	
	List<WebElement> cdata=driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
	System.out.println("colmn size=="+ cdata.size());
	List<String> libc=new ArrayList<String>();
	System.out.println("The colmns in 1st row are===");
	for(WebElement name1:cdata) {
	String Data=name1.getText();
	System.out.println(Data);
	libc.add(Data); }
	System.out.println("The colmn in 1st row(list form)===");
	System.out.println(libc);
	
	List<WebElement> cdata1=driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[2]/td"));
	System.out.println("colmn size=="+ cdata1.size());
	List<String> libc1=new ArrayList<String>();
	System.out.println("The colmns in 2nd row are ===");
	for(WebElement name1:cdata1) {
	String Data=name1.getText();
	System.out.println(Data);
	libc1.add(Data); }
	System.out.println("The colmn in 2nd row(list form)===");
	System.out.println(libc1);
	
	
	
	
	
}}
