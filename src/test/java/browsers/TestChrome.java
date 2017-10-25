package browsers;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class TestChrome {
	
	public static void main(String[] args) {
		for (int i = 0; i <= 1; i++) {
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "/Users/apple/autoTest/workspace/anyptt/libs/chromedriver");
			DesiredCapabilities capabilites = DesiredCapabilities.chrome();
			capabilites.setCapability("chrome.switches", Arrays.asList("--incognito"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			capabilites.setCapability("chrome.binary", "run/chromedriver.exe");
			capabilites.setCapability(ChromeOptions.CAPABILITY, options);
			
			WebDriver driver = new ChromeDriver(capabilites);
			
			driver.manage().window().maximize();

			driver.get("https://www.baidu.com/");


			driver.close();
			driver.quit();
			

			
		}
	}

}
