package Zalenium.testautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xerces.impl.io.MalformedByteSequenceException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeRun_1 {
	
	private RemoteWebDriver driver;
	@Parameters("host")

	
	@Test
	
	public void Chrome_1_Test(@Optional ("localhost") String host) throws InterruptedException, MalformedByteSequenceException, MalformedURLException
	{
		
		if(host.equalsIgnoreCase("localhost"))
		{
			System.out.println("running Zalenium code for chrome_1");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setPlatform(Platform.LINUX);
			driver = new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"),capabilities);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("http://google.com");
			driver.findElement(By.name("q")).sendKeys("Zalenium");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			System.out.println("completed riunning test");
		}
			
		}
	
	
	@AfterClass
	public void closebrowser() {
		if(driver!= null) driver.quit();
	}
	
	}


