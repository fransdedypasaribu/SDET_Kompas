package kompas_nomor_3;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestBerlangganan {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/");
	}
	
//Nomor 3(3)	
	@Test
	public void berlanggan() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[3]/div/div/a[2]")).click();
		String url = driver.getCurrentUrl();
		String expResult = "https://gerai.kompas.id/belanja/harian-kompas/kompas-digital-premium/";
		assertEquals(url,expResult);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
