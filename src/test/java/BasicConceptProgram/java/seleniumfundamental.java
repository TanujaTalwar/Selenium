package BasicConceptProgram.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfundamental {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);

		String title = driver.getTitle();
	

		String pagesource = driver.getPageSource();
		String url = driver.getCurrentUrl();
		
		
		System.out.println("Page Title: " + title);
		//System.out.println("Page source: " + pagesource);
		System.out.println("Page url: " + url);

		driver.quit();
	}
}
