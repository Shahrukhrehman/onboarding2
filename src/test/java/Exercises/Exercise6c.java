package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Exercise6c {
	
	
	@Test
	public void testExercise6c() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		
		
		
		Select select = new Select(driver.findElement(By.id("dropdown")));
		select.selectByIndex(1);
		
		driver.quit();
	}
}