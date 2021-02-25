package kompas_nomor_3;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRunner {
	
	public WebDriver driver;
	private By artikel = By.cssSelector("p.font-georgia");
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.kompas.id/baca/opini/2021/01/14/krisis-lingkungan-dan-bencana-pandemi/");
	}

//Nomor 3(1)
	@Test
	public void getCssValue_Font()  {
		WebElement artikels = driver.findElement(artikel); 
		System.out.println("Font : "+ artikels.getCssValue("font-family"));
	}

//Nomor 3(2)	
	@Test
	public void getCssValue_Align() throws InterruptedException {
		WebElement artikels = driver.findElement(artikel);
		System.out.println("Align : "+ artikels.getCssValue("text-align"));	
	}

//Nomor 3(4)	
	@Test
	public void getDate() {
		  Date objDate = new Date();
		  // Display the Date & Time using toString()
		  System.out.println(objDate.toString());
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
