package automation_excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void test() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//button[@aria-label='Expand to Change Language or Country']"))).perform();
	driver.findElement(By.xpath("//span[text()='मराठी']/parent::span[@class='nav-text']/i")).click();
	Thread.sleep(5000);
	driver.quit();
	
	//test
	}
	
}
