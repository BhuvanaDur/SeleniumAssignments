package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//form[@class='_9vtf']//a)[3]")).click();
		driver.findElement(By.xpath("(//form[@id='reg']//input)[3]")).sendKeys("HSAPPP");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("YCGFH");
		driver.findElement(By.xpath("(//form[@id='reg']//input)[5]")).sendKeys("3456334441");
		driver.findElement(By.xpath("(//form[@id='reg']//input)[7]")).sendKeys("crmsfa");
		WebElement no1 = driver.findElement(By.name("birthday_day"));
		Select sel1 = new Select(no1);
		sel1.selectByVisibleText("15");
		WebElement no2 = driver.findElement(By.name("birthday_month"));
		Select sel2 = new Select(no2);
		sel2.selectByIndex(5);
		WebElement no3 = driver.findElement(By.name("birthday_year"));
		Select sel3 = new Select(no3);
		sel3.selectByValue("2000");
		driver.findElement(By.xpath("(//span[@class='_5k_3']//input)[1]")).click();
		
	}

}
