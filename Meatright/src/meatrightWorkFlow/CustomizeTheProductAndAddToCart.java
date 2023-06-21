package meatrightWorkFlow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeTheProductAndAddToCart {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-radio[@class='md in-item interactive hydrated'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-radio[@class='md in-item interactive hydrated'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-radio[@class='md in-item interactive hydrated'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-radio[@class='md in-item interactive hydrated'])[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-radio[@class='md in-item interactive hydrated'])[10]")).click();

		//Click on add to cart button
		driver.findElement(By.xpath("(//ion-button[@id='addtocart'])[13]")).click();

		//Check the product added to cart by clicking on Add to cart button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ion-button[@id='homecat']")).click();

		//Close the browser
		Thread.sleep(2000);
		driver.quit();


	}

}
