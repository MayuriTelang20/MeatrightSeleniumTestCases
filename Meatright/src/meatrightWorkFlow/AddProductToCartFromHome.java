package meatrightWorkFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductToCartFromHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		//Launch the web application
		driver.get("https://www.meatright.in");
		Thread.sleep(2000);

		//Add the product from home page to the cart
		driver.findElement(By.xpath("(//ion-col[@class='ion-text-center md hydrated'])[6]")).click();

		//Increase the quantity to 2
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ion-icon[@name='add']")).click();

		//Click on Buy now button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ion-button[@id='buy now']")).click();

		//Close the browser
		Thread.sleep(2000);
		driver.quit();
	}

}
