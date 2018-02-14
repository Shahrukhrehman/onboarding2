package Exercises;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise9a {
	@Test
	public void testExercise9a() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Form Authentication")).click();
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.className("radius")).click();	
		
		
		String expectedMessage = "You logged into a secure area!";
		String message = driver.findElement(By.id("flash")).getText();
		
		Assert.assertTrue(message.contains(expectedMessage), expectedMessage);
		
		driver.quit();
	}
}
