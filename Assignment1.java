package week2.day2.assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// Create Account in Facebook
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("LastName");

		//	driver.findElement(By.xpath("//input[@name='reg_email__']/preceding-sibling::div[@class='placeholder']")).sendKeys("9874563245");
		//	driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input[@name='reg_passwd__']")).sendKeys("TestLeaf123");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9874563245");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("TestLeaf123");	
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(ele1);
		day.selectByValue("15");	
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(ele2);
		month.selectByIndex(1);	
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(ele3);
		year.selectByVisibleText("1995");
		driver.findElement(By.xpath("//input[@value='2']/preceding-sibling::label[@class='_58mt']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
