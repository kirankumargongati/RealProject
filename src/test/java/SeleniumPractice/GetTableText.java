package SeleniumPractice;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class GetTableText {
	public  WebDriver driver;
	public GetTableText(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		GetTableText obj=new GetTableText(driver);
		obj.GetTextQA();
		// TODO Auto-generated method stub
//	public void QAfoxGetTable() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://omayo.blogspot.com/");
//		WebElement ele=driver.findElement(By.id("table1"));
//		List<WebElement> row=ele.findElements(By.tagName("tr"));
//		//List<WebElement> column=ele.findElements(By.tagName("th"));
//		for (WebElement rows : row) {
//			List<WebElement> cell=rows.findElements(By.tagName("td"));
//			for(WebElement cells:cell) {
//				System.out.println(cells.getText());
//			}
//		}
//	}
	}
	public  void GetTextQA() {
	driver.get("https://omayo.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	WebElement table=driver.findElement(By.id("table1"));
	List<WebElement> row=table.findElements(By.tagName("tr"));
	for(WebElement rows:row) {
		List<WebElement> cell=rows.findElements(By.tagName("td"));
		for(WebElement cells:cell) {
			System.out.println(cells.getText());
			String name=cells.getText();
			if(name.equals("Manish")) {
				System.out.println("expected condition matched");
			}
		
		}
	}
	driver.close();
	}
	

}
