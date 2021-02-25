package kompas_nomor_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFacebook {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/");
	}
	
//Nomor 3(6)	
	@Test
	public void facebook() throws InterruptedException {
		driver.findElement(By.cssSelector("div.mt-8 > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
