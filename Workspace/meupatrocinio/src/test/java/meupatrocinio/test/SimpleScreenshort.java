package meupatrocinio.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.text.Format;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleScreenshort {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
    /**
     * Navega para url do bytes don't bite
     * Captura o Screenshot
     */
	@Test
	//public void test() {
    public void testScreenshot() {
		
        driver.get("http://www.meupatrocinio.com");
        takeScreenshot("teste");
    	fail("Not yet implemented");
	}
	
    /**
     * Método para capturar screenshot
     * @param fileName - Nome do arquivo
     */
    public static void takeScreenshot(String fileName){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date data = new Date();
        System.out.println(data);
        try {
            FileUtils.copyFile(scrFile, new File("C:\\SeleniumScreenShots\\cadastro-SDM" + data.getTime() + ".jpeg"),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Encerra o driver
     */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}


     

}
