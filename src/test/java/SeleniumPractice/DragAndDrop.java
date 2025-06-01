package SeleniumPractice;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.DateFormatter;

public class DragAndDrop {
	 static WebDriver  driver;
	 static String url="https://jqueryui.com/draggable/";
	 
//	public DragAndDrop() {
//	
//		driver=new ChromeDriver(); 
//	}
	public  static void DrapDrop() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		 driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Droppable\"]")).click();
		 WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement drappable=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(draggable, drappable).build().perform();
		Thread.sleep(300);
		//driver.close();
		driver.switchTo().defaultContent();
	}
 public void getLable() throws InterruptedException {
	 LocalDate currentdate= LocalDate.now();
	 String datec=String.valueOf(currentdate);
	 System.out.println(currentdate);
	 DateTimeFormatter formatdate=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	 String formattedDate=currentdate.format(formatdate);
	 System.out.println(formattedDate);
	 String date=formattedDate;
	// driver.get(url);
	 driver.findElement(By.xpath("//a[text()=\"Datepicker\"]")).click();
	 WebElement frmedatepicker= driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
	 driver.switchTo().frame(frmedatepicker);
	 WebElement enterdate=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
	enterdate.sendKeys(date);
	Thread.sleep(300);
	enterdate.isEnabled();
	String datetext=enterdate.getText();
	System.out.println(datetext);
	if(datetext.contains(date)) {
		System.out.println("Date successfully matched");	
	}
	else {
		System.out.println("Date not matched"); 
	}
	
	driver.switchTo().defaultContent();
	 }
 
 public void RadioAndCheckbox() {
	// driver.findElement(By.xpath("//a[text()=\"Controlgroup\"]")).click();
	// driver.findElement(By.linkText("https://jqueryui.com/controlgroup/")).click();
	 driver.findElement(By.linkText("Controlgroup")).click();
 }
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DragAndDrop.DrapDrop();
		DragAndDrop obj=new DragAndDrop();
		//obj.getLable();
		obj.RadioAndCheckbox();
	}

}
