package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kavitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Durai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KaviDur");
		driver.findElement(By.name("departmentName")).sendKeys("Learning");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for Assignment 1");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		WebElement WC = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select opt = new Select(WC);
		opt.selectByValue("AE");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("Title of the page: " + driver.getTitle());

	}

}
