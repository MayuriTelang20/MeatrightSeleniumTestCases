package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Launch the web application
		driver.get("https://www.meatright.in");
		
		//Login to the Meatright website
		driver.findElement(By.xpath("//ion-menu-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ion-row)[1]")).click();
		driver.findElement(By.xpath("//body/app-root/ion-app[@class='md ion-page hydrated']/ion-router-outlet[@id='main-content']/ng-component[@class='ion-page']/ion-tabs/div[@class='tabs-inner']/ion-router-outlet[@class='hydrated']/page-login[@class='ion-page']/ion-content[@class='md content-ltr hydrated']/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Please Enter Valid Mobile No']")).sendKeys("8329660874");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[1]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[2]")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[3]")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@autocomplete='one-time-code'])[4]")).sendKeys("4");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ion-button[@id='add2cart'])[1]")).click();
		
		
		
	}

}
