package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise9b {
	@Test
	public void testExercise9b() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Form Authentication")).click();
		
		driver.findElement(By.id("username")).sendKeys("tomsmith1");
		driver.findElement(By.id("password")).sendKeys("SecretPassword!");
		
		driver.findElement(By.className("radius")).click();	
		
		String expectedMessage = "You logged into a secure area!";
		String message = driver.findElement(By.id("flash")).getText();
		
		Assert.assertFalse(message.contains(expectedMessage), expectedMessage);
		
		driver.quit();
	}
}
