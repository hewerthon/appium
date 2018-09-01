package meupatrocinio.test;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CadastroSDM {
	private WebDriver driver;

	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//driver = new FirefoxDriver();

		baseUrl = "https://registration-staging3.meupoder.net";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


    
	@Test
	public void testSignSDM() throws Exception {

		int MyVar = 1;
		while (MyVar < 2) {
			
	        Date data = new Date();
	        System.out.println(data);
	        System.out.println(MyVar);
			// Variables section

			// String ambiente = "https://registration-staging1.meupoder.net/";
			// System.out.println(ambiente);

			String email = "hewerthonteste" + data.getTime() + "@mailinator.com";
			System.out.println(email);
			String senha = "mp2016";
			System.out.println(senha);
			String username = "HewerthonTeste" + data.getTime();
			System.out.println(username);
			String texto = "Teste MP  :-) =) :D :x =O 😀 💙 😈 😂 😋";
			System.out.println(texto);
			String foto = "C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Homens\\Brad-Pitt.jpg";
			String foto2 = "C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Mulheres\\Beyonce.jpg";
			String foto3 = "C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Mulheres\\Mulher-4.jpg";
			System.out.println(foto);
			String evidencePath = "C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Automatizacao\\MeuPatronicio\\Evidencias\\Sign\\";
			System.out.println(evidencePath);
			String evidenceName = "Profile-Hopping-" + data.getTime() + ".png";
			System.out.println(evidenceName);
			// Reset previous navigation
			// ERROR: Caught exception [ERROR: Unsupported command
			// [deleteAllVisibleCookies | | ]]
			// MP
			// driver.get(baseUrl + ambiente);
			driver.get(baseUrl);
			// Accept term
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("agree")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("agree")).click();
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("agree_btn")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("agree_btn")).click();
			// Crie sua conta
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("email")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("email")).sendKeys(email);
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("re_email")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("re_email")).sendKeys(email);
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("password")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("password")).sendKeys(senha);
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("re_password")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("re_password")).sendKeys(senha);
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("nascimento")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			driver.findElement(By.id("nascimento")).click();
			driver.findElement(By.linkText("9")).click();
			new Select(driver.findElement(By.id("sex"))).selectByVisibleText("Masculino");
			driver.findElement(By.name("extended[what]")).click();
			driver.findElement(By.xpath("(//input[@name='match_sex[]'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			
			// Confirmar Profile Type
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.xpath("(//button[@type='button'])[4]")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			
			// Sobre Você
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("state_id")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			new Select(driver.findElement(By.id("state_id"))).selectByVisibleText("Sao Paulo");
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("city_id")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			new Select(driver.findElement(By.id("city_id"))).selectByVisibleText("São Paulo");
			new Select(driver.findElement(By.id("height1"))).selectByVisibleText("170 cm");
			new Select(driver.findElement(By.id("body_type"))).selectByVisibleText("Magro");
			new Select(driver.findElement(By.id("ethnicity"))).selectByVisibleText("Branco / Caucasiano");
			new Select(driver.findElement(By.id("hair_color"))).selectByVisibleText("Castanho");
			new Select(driver.findElement(By.id("eye_color"))).selectByVisibleText("Castanho Claro");
			new Select(driver.findElement(By.id("smoke"))).selectByVisibleText("Nunca");
			new Select(driver.findElement(By.id("drink"))).selectByVisibleText("Socialmente");
			new Select(driver.findElement(By.id("relationship"))).selectByVisibleText("Solteiro(a)");
			new Select(driver.findElement(By.id("have_children"))).selectByVisibleText("Não");
			new Select(driver.findElement(By.id("education"))).selectByVisibleText("Superior completo");
			new Select(driver.findElement(By.id("occupation"))).selectByVisibleText("Consultor");
			new Select(driver.findElement(By.id("income"))).selectByVisibleText("R$10.000 ou menos");
			new Select(driver.findElement(By.id("net_worth"))).selectByVisibleText("Menos que R$100.000");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
			Thread.sleep(1000);
			// O seu perfil
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.id("username")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("headline")).sendKeys("TESTE");
			driver.findElement(By.id("general_description")).sendKeys("TESTES");
			new Select(driver.findElement(By.id("happy_to_travel"))).selectByVisibleText("Mundo Inteiro");
			new Select(driver.findElement(By.id("lifestyle_budget"))).selectByVisibleText("Negociável");
			driver.findElement(By.id("description")).sendKeys("Testes");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();

			// Carregar Foto
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.cssSelector("img.img-responsive.one")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}


			Thread.sleep(1000);
			driver.findElement(By.id("one")).sendKeys("C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Homens\\Brad-Pitt.jpg");
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.id("two")).sendKeys("C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Homens\\Brad-Pitt.jpg");
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.id("three")).sendKeys("C:\\Users\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Homens\\Brad-Pitt.jpg");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
			// Verifica sucesso
			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.cssSelector("div.resend-email > div > h4")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			for (int second = 0;; second++) {
				if (second >= 60)
					fail("timeout");
				try {
					if (driver.findElement(By.cssSelector("#success_mail > p")).isDisplayed())
						break;
				} catch (Exception e) {
				}
				Thread.sleep(1000);
			}

			MyVar++;

		}
		// End While
		// ERROR: Caught exception [ERROR: Unsupported command [getEval ]]
		// ERROR: Caught exception [unknown command [endWhile]]
		// Evidence
		// ERROR: Caught exception [ERROR: Unsupported command
		// [captureEntirePageScreenshot | ${evidencePath}$(evidenciaName)]
		


	    
		// Finaliza Sessão
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
	


	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
