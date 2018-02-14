package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise8e {
	@Test
	public void testExercise8e() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.partialLinkText("Tables")).click();
		
		for (int x = 1; x < 5; x++) {
			
			String rowNum = driver.findElement(By.xpath("//*[@id=\'table1\']/tbody/tr[" + x + "]")).getText();

			if (rowNum.contains("jdoe@hotmail.com")) {
				System.out.println("Row Number " + x + " contains jdoe@hotmail.com");
			}
		}
		
		driver.quit();
	}
}
