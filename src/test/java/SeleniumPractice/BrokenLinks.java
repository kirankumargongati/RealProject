package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		Set<String> brokenlinkurls=new HashSet<String>();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String linkurl=link.getAttribute("href");
			URL url=new URL(linkurl);
			URLConnection urlconnection=url.openConnection();
			HttpURLConnection httpurlconnection=(HttpURLConnection)urlconnection;
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();
			if(httpurlconnection.getResponseCode()!=200) {
				brokenlinkurls.add(linkurl);
			}
			httpurlconnection.disconnect();
		}
driver.quit();
for (String brokenlink : brokenlinkurls) {
	System.out.println(brokenlink);
}
	}

}
