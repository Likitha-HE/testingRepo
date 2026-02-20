package automation_excercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void test() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[text()='MR']/preceding::i[1][@class='icp-radio']")));
	
	
	//test
	}
}
//span[text()='MR']/preceding::i[1][@class="icp-radio"]