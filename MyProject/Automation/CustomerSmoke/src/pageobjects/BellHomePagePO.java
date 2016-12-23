package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driver.BaseDriver;

public class BellHomePagePO extends BaseDriver{
	
	@FindBy
	WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));

}

