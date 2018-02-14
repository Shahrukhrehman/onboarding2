package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise8d {
	@Test
	public void testExercise7() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.partialLinkText("Tables")).click(); 
		
		String firstRow = driver.findElement(By.xpath("//*[@id=\'table1\']/tbody/tr[1]")).getText();
		System.out.println(firstRow);
		
		driver.quit();
	}
}
