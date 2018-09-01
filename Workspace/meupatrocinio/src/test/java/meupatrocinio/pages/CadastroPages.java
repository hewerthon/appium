package meupatrocinio.pages;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {

	// Instanciando a classe webdrive
	static WebDriver drive;
	
	
	
	public CadastroPages(WebDriver driver){
		this.drive = driver;
	
		
	}

	
	public void preencherCampos(){
		
		WebElement nome = drive.findElement(By.id("search"));
		nome.sendKeys("Hewerthon");
		
		WebElement buscar = drive.findElement(By.xpath(".//*[@id='search-icon-legacy']"));
		buscar.click();
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
