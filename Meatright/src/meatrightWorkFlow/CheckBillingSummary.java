package meatrightWorkFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBillingSummary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//Launch the web application
		driver.get("https://www.meatright.in");
		Thread.sleep(2000);

		//Add the product to the cart
		driver.findElement(By.xpath("(//ion-col[@class='ion-text-center md hydrated'])[1]")).click();
		driver.findElement(By.xpath("(//ion-button[@id='addtocart'])[13]")).click();

		//Check the product added to cart by clicking on Add to cart button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ion-button[@id='homecat']")).click();

		//Check billing summary
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-col[@class='ion-text-end md hydrated'])[7]")).click();

		//Close the browser
		Thread.sleep(2000);
		driver.quit();

	}

}
