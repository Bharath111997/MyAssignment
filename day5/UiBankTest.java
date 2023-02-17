package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBankTest {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vijay");
        WebElement title = driver.findElement(By.xpath("//select[@id='title']"));
        Select selectTitle = new Select(title);
		selectTitle.selectByVisibleText("Mr");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");
		WebElement status = driver.findElement(By.xpath("//select[@id='employmentStatus']"));
		Select selectStatus = new Select(status);
		selectStatus.selectByVisibleText("Full-time");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABC@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("khffkhkh");
		driver.close();
	}

}
