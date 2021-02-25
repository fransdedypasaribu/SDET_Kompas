package kompas_nomor_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestText {
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/");
	}

//Nomor 3(5)
	@Test
	public void jenistext() throws InterruptedException {
		WebElement text = driver.findElement(By.cssSelector("div.mr-4:nth-child(1) > div:nth-child(1) > button:nth-child(1)")); 
		Actions action = new Actions(driver);
		action.moveToElement(text).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
