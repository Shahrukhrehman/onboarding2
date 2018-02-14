package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Exercise10b {
	@Test
	public void testExercise10b() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.xpath("//*[@id=\'content\']/div/a[1]")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
		
		driver.quit();	
	}
}
