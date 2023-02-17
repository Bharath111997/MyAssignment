package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("Bharath");
		driver.findElement(By.name("lastname")).sendKeys("Narayanan");
		driver.findElement(By.name("reg_email__")).sendKeys("6380687835");
		driver.findElement(By.id("password_step_input")).sendKeys("bharath@11");
		driver.findElement(By.id("day")).sendKeys("11");
		driver.findElement(By.id("month")).sendKeys("Sep");
		driver.findElement(By.id("year")).sendKeys("1997");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
