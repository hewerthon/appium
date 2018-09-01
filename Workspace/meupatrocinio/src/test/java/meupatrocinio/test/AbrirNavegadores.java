package meupatrocinio.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbrirNavegadores {

	// Instanciando a classe webdrive
	static WebDriver drive;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// caminho executavel firefox e chrome drive executavel
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		
		drive = new ChromeDriver();
		//drive = new FirefoxDriver();
		
		
		drive.get("http://youtube.com.br");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		drive.close();
		
		//drive.quit();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		
	}

}
