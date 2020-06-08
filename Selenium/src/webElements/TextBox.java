package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBox {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Select s = new Select(driver.findElement(By.id("day")));
		s.selectByIndex(3);
		
		
		//driver.quit();

	}

}
