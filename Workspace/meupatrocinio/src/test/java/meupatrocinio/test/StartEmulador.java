package meupatrocinio.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartEmulador {

	// create global variable

	private static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Create object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Optional
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

		// Specify the device name (any name)
		capabilities.setCapability("deviceName", "Android Emulator");

		// Platform version
		capabilities.setCapability("platformVersion", "8.0.0");

		File diretorioAplicacao = new File("C:\\");
		File arquivoAplicacao = new File(diretorioAplicacao, "production-v1.0.2-rc1.apk");

		// platform name
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability(MobileCapabilityType.APP, arquivoAplicacao.getAbsolutePath());

		// File file = new File("C:\\production-v1.0.2-rc1.apk");
		// capabilities.setCapability("app", file.getAbsolutePath());

		// specify the application package that we copied from appium
		// capabilities.setCapability("appPackage", "io.selendroid.testapp");
		// capabilities.setCapability("appPackage", "com.meupatrocinio.dating");

		// specify the application activity that we copied from appium
		// capabilities.setCapability("appActivity", ".HomeScreenActivity");
		// capabilities.setCapability("appActivity",
		// ".com.tns.NativeScriptActivity");

		// Start android driver I used 4727 port by default it will be 4723
		// driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
		// capabilities);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		// Specify the implicit wait of 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter the text in textbox
		// Wait for 10 second
		Thread.sleep(5000);
		// Botão PULA
		driver.findElement(By.xpath(".//android.widget.Button[@text='PULAR']")).click();
		Thread.sleep(500);
		// Botão Entrar
		driver.findElement(By.xpath(".//android.widget.Button[@text='ENTRAR']")).click();
		Thread.sleep(500);
		// Campo username / e-mail
		driver.findElement(By.xpath(".//android.widget.EditText[@text='Email ou Nome de usuário']")).click();
		Thread.sleep(500);
		// Campo username / e-mail		
		driver.findElement(By.xpath(".//android.widget.EditText[@text='Email ou Nome de usuário']")).sendKeys("Hewerthon");
		Thread.sleep(500);
		// Campo senha
		driver.findElement(By.xpath(".//android.widget.EditText[@text='Senha']")).click();
		Thread.sleep(500);
		// Campo senha
		driver.findElement(By.xpath(".//android.widget.EditText[@text='Senha']")).sendKeys("021590");
		Thread.sleep(500);
		// Botão entrar
		driver.findElement(By.xpath(".//android.widget.Button[@text='ENTRAR']")).click();
		// Wait for 10 second
		Thread.sleep(10000);
		// Verificar a lista novos
		driver.findElement(By.xpath(".//android.widget.TextView[@text='NOVOS']")).click();
		Thread.sleep(5000);
		// Verificar a lista próximos
		driver.findElement(By.xpath(".//android.widget.TextView[@text='PRÓXIMOS']")).click();
		Thread.sleep(5000);
		// Verificar a lista destacados
		driver.findElement(By.xpath(".//android.widget.TextView[@text='DESTAQUES']")).click();
		Thread.sleep(5000);
		// Verificar a lista Interesses me viu
		driver.findElement(By.xpath(".//android.widget.TextView[@text='Interesses']")).click();
		Thread.sleep(5000);
		// Verificar a lista favoritos
		driver.findElement(By.xpath(".//android.widget.TextView[@text='FAVORITOS']")).click();
		Thread.sleep(5000);
		// Verificar a lista favoritou-me
		driver.findElement(By.xpath(".//android.widget.TextView[@text='FAVORITOU-ME']")).click();
		Thread.sleep(5000);
		// Verificar a lista me viu
		driver.findElement(By.xpath(".//android.widget.TextView[@text='ME VIU']")).click();
		Thread.sleep(5000);
		
		// Menu inferior inicio
		driver.findElement(By.xpath(".//android.widget.TextView[@text='Início']")).click();
		Thread.sleep(5000);
		// Menu inferior mensagens
		driver.findElement(By.xpath(".//android.widget.TextView[@text='Mensagens']")).click();
		Thread.sleep(5000);
		// Menu inferior interesses
		driver.findElement(By.xpath(".//android.widget.TextView[@text='Interesses']")).click();
		Thread.sleep(5000);
		// Menu inferior perfil
		driver.findElement(By.xpath(".//android.widget.TextView[@text='Perfil']")).click();
		Thread.sleep(5000);

		// close the application

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


}
