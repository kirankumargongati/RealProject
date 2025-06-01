package SeleniumPractice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterRandomData {
	public void enterRandomData() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.xpath("//input[@name=\"textboxn\"]"));
		el.click();
		int finalint=randomnumber();
		String finalstr= String.valueOf(finalint);
		el.sendKeys(finalstr);
		Thread.sleep(300);
		System.out.println("text"+el.getAttribute("fdprocessedid"));
		//System.out.println("text"+el.getText());
		Thread.sleep(500);
		driver.close();
		
	}
	public int randomnumber() {
		Random randomNumber=new Random();
		int finalranedom=randomNumber.nextInt(10, 30);
		return finalranedom;
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EnterRandomData obj=new EnterRandomData();
		obj.enterRandomData();
		System.out.println("successfull");

	}

}
