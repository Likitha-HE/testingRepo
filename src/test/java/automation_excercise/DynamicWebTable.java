package automation_excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicWebTable {
@Test
public void test() throws InterruptedException {
	String value="Firefox";

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act = new Actions(driver);
	WebElement ele = driver.findElement(By.xpath("//p[text()='CPU load of Chrome process: ']"));
	act.scrollToElement(ele).perform();
	String data = driver.findElement(By.xpath("//table[@id='taskTable']/tbody//tr/td[text()='"+value+"']/following::td[contains(text(),'%')]")).getText();
	System.out.println(data);
	
	Thread.sleep(5000);
	driver.quit();
}
}
