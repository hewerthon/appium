package meupatrocinio.test;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartApplication {

	// create global variable

	private static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// Create object of DesiredCapabilities class
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Optional
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

		// Specify the device name (any name)
		capabilities.setCapability("deviceName", "My New Phone");

		// Platform version
		capabilities.setCapability("platformVersion", "6.0.1");

		// platform name
		capabilities.setCapability("platformName", "Android");
		
		File file = new File("C:\\production-v1.0.2-rc1.apk");
		capabilities.setCapability("app", file.getAbsolutePath());

		// specify the application package that we copied from appium
		//capabilities.setCapability("appPackage", "io.selendroid.testapp");
		//capabilities.setCapability("appPackage", "com.meupatrocinio.dating");

		// specify the application activity that we copied from appium
		//capabilities.setCapability("appActivity", ".HomeScreenActivity");
		//capabilities.setCapability("appActivity", ".com.tns.NativeScriptActivity");
		
		// Start android driver I used 4727 port by default it will be 4723
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		// Specify the implicit wait of 5 second
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Enter the text in textbox
		// Wait for 10 second
		Thread.sleep(10000);
		driver.findElement(By.xpath(".")).click();
		driver.findElement(By.xpath(".")).sendKeys("Hewerthon");
		driver.findElement(By.xpath(".")).sendKeys("mp2016");
		driver.findElement(By.xpath(".").name("PULAR"));
		
				
		//driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Mukesh Selenium Appium");

		// click on registration button
		//driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();

		// Wait for 10 second
		Thread.sleep(10000);

		// close the application
		driver.quit();

	}

}
