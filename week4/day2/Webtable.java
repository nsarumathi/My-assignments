package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Initial screen=="+ driver.getTitle());
	
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
	
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("BNC",Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		System.out.println("Screen aftr entering==="+ driver.getTitle());
		
		List<String> trainList = new ArrayList<String>();
		List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		int size = train.size();
		System.out.println("row size=="+size);
		
		Thread.sleep(2000);
		System.out.println("No of trains ID's in list=======================================" );
		for (int i = 2; i <= size; i++) {
		String arrange = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + i + "]/td[1]")).getText();
		trainList.add(arrange);
		}
		System.out.println(trainList);
				
		System.out.println("Train names are ================================");
		List<WebElement>  Trainname=driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr/td[2]"));
		List<String> Train=new ArrayList<String>();

		for(WebElement name:Trainname) {
		String Data=name.getText();
		Train.add(Data); }
		System.out.println("No of train name in list==" +Train.size());
		
		System.out.println(Train);
		
		Set<String> unique=new HashSet<String>(Train);
		System.out.println("No of train name in set=="+ unique.size());
		
		if(Train==unique) {System.out.println("Result::There is no duplicate");}
		else {System.out.println("Result::Found duplicates");}
		
	}}


