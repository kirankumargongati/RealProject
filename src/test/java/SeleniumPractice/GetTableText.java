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

public class GetTableText {
	WebElement driver;
	
	public GetTableText(WebElement driver) {
		// TODO Auto-generated constructor stub
		driver=this.driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
  driver.get("https://testpages.eviltester.com/styled/index.html");
  driver.findElement(By.xpath("tablestest")).click();
   WebElement table=driver.findElement(By.xpath("//table[@id=\"mytable\"]/tbody"));
  List<WebElement> rows=table.findElements(By.tagName("tr"));
  for (WebElement row : rows) {
	  List<WebElement> cells=table.findElements(By.tagName("td"));
	  for (WebElement cell : cells) {
		  System.out.println(cell.getText());
		
	}
	  System.out.println();
	  
	  
	
}
  driver.close();
	}
	
	
	

}
