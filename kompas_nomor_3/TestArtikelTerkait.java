package kompas_nomor_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestArtikelTerkait {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/");
	}
	
//Nomor 3(9)	
	@Test
	public void artikelterkait() throws InterruptedException {
		List<WebElement> link = driver.findElements(By.className("flex items-center mb-2"));
		System.out.println(link.size());
	}
	
	@AfterClass
	public void tearDown() {
	//	driver.quit();
	}
	
}
