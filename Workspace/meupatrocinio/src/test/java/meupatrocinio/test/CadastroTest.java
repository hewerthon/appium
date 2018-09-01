package meupatrocinio.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import meupatrocinio.pages.CadastroPages;

public class CadastroTest {
	
	// Instanciando a classe webdrive
	static WebDriver drive;
	static CadastroPages CadastroPages;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// caminho executavel firefox e chrome drive executavel
		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		
		//drive = new ChromeDriver();
		drive = new FirefoxDriver();
		
		drive.get("https://youtube.com.br");
		CadastroPages = new CadastroPages(drive);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		//drive.close();
	}

	@Test
	public void test() {
		CadastroPages.preencherCampos();
		fail("Not yet implemented");
	}

}
