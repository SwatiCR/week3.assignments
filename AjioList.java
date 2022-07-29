package week3.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		/*	1. Launch the URL https://www.ajio.com/
			2. In the search box, type as "bags" and press enter
			3. To the left  of the screen under " Gender" click the "Men"
			4. Under "Category" click "Fashion Bags"
			5. Print the count of the items Found. 
			6. Get the list of brand of the products displayed in the page and print the list.
			7. Get the list of names of the bags and print it
		*/
		//WebDriverManager for browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.ajio.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		//5. Print the count of the items Found.
		String text = driver.findElement(By.xpath("//div[@class=' filter-container']//div[@class='length']")).getText();
		
		System.out.println("Total number of bags found: "+text);
		System.out.println("Brand Names of Bags: ");
		
		//6. Get the list of brand of the products displayed in the page and print the list.		
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		
		for (WebElement webElement : brandList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
		System.out.println("Names of Bags: ");
		//7. Get the list of names of the bags and print it
		List<WebElement> bagName = driver.findElements(By.className("nameCls"));
		
		for (WebElement webElement : bagName) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
	}	

}
