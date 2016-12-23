package driver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {
	
	public static FirefoxDriver driver;
	//public static InternetExplorerDriver d1;
	
	public static FirefoxDriver launchApp() 
	{
		System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+ "\\libs\\geckodriver.exe");
		BaseDriver.driver = new FirefoxDriver(); 
		driver.get("http://tele2.devm2m.com/tele2/home/KyuDUArz");
		//System.out.println(""+ driver.findElement(By.xpath("//input[@value='Request']")).isDisplayed());
		return driver;
	}

}
