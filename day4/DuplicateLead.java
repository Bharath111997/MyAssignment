package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Narayanan");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("N");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Test Engineer");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("To create new leads");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathyadav0802@gmail.com");
	    WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select selectState=new Select(state);
	    selectState.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    String title=driver.getTitle();
	    System.out.println("Title is "+driver.getTitle());
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Savista");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println("Title is "+driver.getTitle());
	    
	}

}