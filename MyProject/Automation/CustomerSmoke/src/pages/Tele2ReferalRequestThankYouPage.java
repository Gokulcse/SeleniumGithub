package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilitymethods.UtilityMethods;
import driver.BaseDriver;
import pages.Tele2ReferralRequestpage;

public class Tele2ReferalRequestThankYouPage extends BaseDriver {
	
	public static FirefoxDriver driver;
	static Properties allInputValue;

	public static void main(String[] args) throws IOException 
	{
		allInputValue = UtilityMethods.getPropValues();
		Tele2ReferralRequestpage.RequestButtonValidation();
		try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
		headerValidation();
		SectionOnevalidation();
		System.out.println("Section One is completed");
		
	}
	public static void headerValidation()
	{
		validateOperatorLogo();
		validateCompanyLogo();
		//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//img[@alt='Tele2']")), driver.findElement(By.xpath("//img[@title='What is IoT']")));
				
	}
	public static void validateOperatorLogo()
	{
		try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='Tele2']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("tele2logo"),"Bell Operator Logo");		
	} 
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("companyLogo"),"Cisco Jasper Company Logo");		
	}
	public static void SectionOnevalidation()
	{
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//h2")).getText(), "Thank you for your request!", "equalsignorecase");
		UtilityMethods.StringValidation(driver.findElement(By.xpath("//p")).getText(), "An e-mail has been sent to you to confirm your request has been received. You will receive a response within 3 business days.", "equalsignorecase");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='text-center']//a")), "NotEqual","Back to IoT Starter Kit Page Link button");		

		
	}

}
