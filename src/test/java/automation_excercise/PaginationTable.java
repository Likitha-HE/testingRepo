package automation_excercise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PaginationTable {
	
	@Test
	public void getData() throws InterruptedException {
		String data="VR Headset";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
		act.scrollToElement(ele);
		for (int i = 1; i <= 4; i++) {
			List<WebElement> names = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
			for (WebElement name : names) {
				String productName = name.getText();
				if (productName.equalsIgnoreCase(data)) {
					driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[text()='" + data + "']/following-sibling::td/input[@type='checkbox']")).click();
					String value = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr/td[text()='" + data +"']/following-sibling::td[1]")).getText();
					System.out.println(value);  
				}
			}
			if (i<4) {
				driver.findElement(By.xpath("//a[text()='" + (i + 1) + "']")).click();
				Thread.sleep(2000);
			}
		}	
		Thread.sleep(5000);
		driver.quit();	
	}
}
