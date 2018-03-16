import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("First Class");
		System.out.println("First Test");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		WebElement SB = driver.findElement(By.id("lst-ib"));
		SB.sendKeys("Download Java");
		
		WebElement searchB = driver.findElement(By.name("btnK"));
		searchB.click();
		

	}

}
