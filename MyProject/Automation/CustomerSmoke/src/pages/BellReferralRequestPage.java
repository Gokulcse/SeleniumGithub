package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilitymethods.UtilityMethods;
import driver.BaseDriver;

public class BellReferralRequestPage extends BaseDriver
{	
	public static FirefoxDriver driver = launchApp();
	static Properties allInputValue;
	public static void main(String[] args) throws IOException 
	{
		allInputValue = UtilityMethods.getPropValues();
		headerValidation();
		System.out.println("header Section Completed");
		sectionOneValidation();
		System.out.println("Section one Completed");
	}
	public static void headerValidation()
	{
		validateOperatorLogo();
		validateCompanyLogo();
		//UtilityMethods.PageNavigationValidation(driver.findElement(By.xpath("//img[@alt='Bell']")), driver.findElement(By.xpath("//img[@title='What is IoT']")));
				
	}
	public static void validateOperatorLogo()
	{
		WebElement operatorLogo = driver.findElement(By.xpath("//img[@alt='Bell']"));
		UtilityMethods.DisplayEnableValidator(operatorLogo, "NotEqual","Bell Operator Logo in IoT Starter Kit");	
		UtilityMethods.Imagevalidation(operatorLogo,"src",allInputValue.getProperty("bellLogo"),"Bell Operator Logo");		
	} 
	public static void validateCompanyLogo()
	{
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt='Cisco Jasper']"));
		UtilityMethods.DisplayEnableValidator(companyLogo, "NotEqual","Cisco Jasper Company Logo in IoT Starter Kit");		
		UtilityMethods.Imagevalidation(companyLogo,"src",allInputValue.getProperty("companyLogo"),"Cisco Jasper Company Logo");		
	}
	public static void sectionOneValidation()
	{
		RequestReferralCodeTextBoxDisplayedAndEnabled();
		RequestReferralCodeLabelTextDisplayedAndEnabled();
		RequestReferralCodePlaceholderValidation();
		ReferralRequestCodeValidInputValidation();
		ReferralRequestRequiredFieldValidation();
		ReferralRequestSpaceNotAllowedValidation();
		ReferralRequestMaximumInputValidation();
		ReferralRequestMinimumInputValidation();
		
		
	}
	public static void RequestReferralCodeTextBoxDisplayedAndEnabled()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='fname']")), "NotEqual", "First Name Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='lname']")), "NotEqual", "Last Name Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='company']")), "NotEqual", "Company Name Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='postion']")), "NotEqual", "Position/Role Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='phoneNumber']")), "NotEqual", "Phone Number Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='email']")), "NotEqual", "E-mail Address Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='device']")), "NotEqual", "Module Name Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//select[@id='industryId']")), "NotEqual", "Business Type Drop Down Menu");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='mini0']")), "NotEqual", "2FF/Ruggedized Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='mini1']")), "NotEqual", "3FF/Ruggedized Micro Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='mini2']")), "NotEqual", "Nano SIM Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='deviceVolume']")), "NotEqual", "Volume to deploy Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='with3mn00']")), "NotEqual", "Within 3 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='with3mn01']")), "NotEqual", "3-6 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='with3mn02']")), "NotEqual", "6-12 months Radio Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@id='with3mn03']")), "NotEqual", "More than 12 months/unknown Radio Button");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//textarea[@id='targetAudience']")), "NotEqual", "Description Input Field");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//a[@name='reset']")), "NotEqual", "Cancel Button");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//input[@value='Request']")), "NotEqual", "Request Button");	
	}
	public static void RequestReferralCodeLabelTextDisplayedAndEnabled()
	{
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='First Name']")), "NotEqual", "First Name Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Last Name']")), "NotEqual", "Last Name Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Company Name']")), "NotEqual", "Company Name Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Position/Role']")), "NotEqual", "Position/Role Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Phone Number']")), "NotEqual", "Phone Number Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='E-mail Address']")), "NotEqual", "E-mail Address Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Module']")), "NotEqual", "Module Name Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Business Type']")), "NotEqual", "Business TypeLabel Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='SIM Type']")), "NotEqual", "Sim Type Label Text");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='2FF/Ruggedized']")), "NotEqual", "2FF/Ruggedized Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='3FF/Ruggedized Micro']")), "NotEqual", "3FF/Ruggedized Micro Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Nano SIM']")), "NotEqual", "Nano SIM Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Volume to Deploy']")), "NotEqual", "Volume to deploy Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Launch Timeframe']")), "NotEqual", "Launch Timeframe Label Text");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Within 3 months']")), "NotEqual", "Within 3 months Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='3-6 months']")), "NotEqual", "3-6 months Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='6-12 months']")), "NotEqual", "6-12 months Label Text");	
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='More than 12 months/unknown']")), "NotEqual", "More than 12 months/unknown Label Text");
		UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//label[text()='Description']")), "NotEqual", "Description Label Text");			
	}
	public static void RequestReferralCodePlaceholderValidation()
	{
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='fname']")), "Enter your first name", "First Name");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='lname']")), "Enter your last name", "Last Name");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='company']")), "Enter your company name", "Company Name");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='postion']")), "Enter your position/role", "position/role");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='phoneNumber']")), "", "Phone Number");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='email']")), "Enter e-mail", "Email-ID");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='device']")), "Enter the module used in your device", "Module");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//input[@id='deviceVolume']")), "Enter first year quantity", "Volume to deploy");
		UtilityMethods.PlaceholderValidation(driver.findElement(By.xpath("//textarea[@id='targetAudience']")), "Tell us a little about your device, target audience, and how we can help.", "Description");
		
	}
	public static void ReferralRequestCodeValidInputValidation()
	{
		driver.findElement(By.xpath("//input[@value='Request']")).click();
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='fname']")), allInputValue.getProperty("ValidFirstName"), driver.findElement(By.xpath("//div[@id='fname-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='lname']")), allInputValue.getProperty("ValidLastName"), driver.findElement(By.xpath("//div[@id='lname-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='company']")), allInputValue.getProperty("ValidCompanyName"), driver.findElement(By.xpath("//div[@id='company-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='postion']")), allInputValue.getProperty("ValidPosition"), driver.findElement(By.xpath("//div[@id='postion-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='phoneNumber']")),allInputValue.getProperty("ValidPhoneNumber"),driver.findElement(By.xpath("//div[@id='phoneNumber-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='email']")),allInputValue.getProperty("ValidEmailId") , driver.findElement(By.xpath("//div[@id='email-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='device']")), allInputValue.getProperty("ValidModule"), driver.findElement(By.xpath("//div[@id='device-error']")));	
		UtilityMethods.ValidateDropDown(driver.findElement(By.xpath("//select[@id='industryId']")), "Consumer electronics - personal navigation", driver.findElement(By.xpath("//div[@id='industryId-error']")));
		//UtilityMethods.ValidateSimTypeRadioButton(2,driver.findElement(By.xpath("//div[@id='simTypeId-error']")));	
		//driver.findElement(By.xpath("//label[text()='2FF/Ruggedized']")).click();
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//input[@id='deviceVolume']")), allInputValue.getProperty("ValidVolumeToDeploy"), driver.findElement(By.xpath("//div[@id='deviceVolume-error']")));
		UtilityMethods.ValidInputValidation(driver.findElement(By.xpath("//textarea[@id='targetAudience']")), allInputValue.getProperty("ValidDescription"), driver.findElement(By.xpath("//div[@id='targetAudience-error']")));
	
	}
	
	public static void  ReferralRequestRequiredFieldValidation()
	{
		driver.findElement(By.xpath("//input[@value='Request']")).click();
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='fname']")), driver.findElement(By.xpath("//div[@id='fname-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='lname']")), driver.findElement(By.xpath("//div[@id='lname-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='company']")), driver.findElement(By.xpath("//div[@id='company-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='postion']")), driver.findElement(By.xpath("//div[@id='postion-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='phoneNumber']")), driver.findElement(By.xpath("//div[@id='phoneNumber-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='email']")), driver.findElement(By.xpath("//div[@id='email-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='device']")), driver.findElement(By.xpath("//div[@id='device-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//select[@id='industryId']")), driver.findElement(By.xpath("//div[@id='industryId-error']")),"DropDown");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//label[text()='SIM Type']")), driver.findElement(By.xpath("//div[@id='simTypeId-error']")),"RadioButton");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//input[@id='deviceVolume']")), driver.findElement(By.xpath("//div[@id='deviceVolume-error']")),"TextBox");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//label[text()='Launch Timeframe']")), driver.findElement(By.xpath("//div[@id='launchTimeFrameId-error']")),"RadioButton");
		UtilityMethods.RequiredFieldValidation(driver.findElement(By.xpath("//textarea[@id='targetAudience']")), driver.findElement(By.xpath("//div[@id='targetAudience-error']")),"TextBox");
			
	}
	
	 public static void ReferralRequestSpaceNotAllowedValidation()
	 {	
		 driver.findElement(By.xpath("//input[@value='Request']")).click();
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@id='fname']")), driver.findElement(By.xpath("//div[@id='fname-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@id='lname']")), driver.findElement(By.xpath("//div[@id='lname-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@id='company']")), driver.findElement(By.xpath("//div[@id='company-error']")));
		 UtilityMethods.SpaceNotAllowedvalidation(driver.findElement(By.xpath("//input[@id='postion']")), driver.findElement(By.xpath("//div[@id='postion-error']")));
		
	 }
	 
	 public static void ReferralRequestMaximumInputValidation()
	 {
		driver.findElement(By.xpath("//input[@value='Request']")).click();
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='fname']")), driver.findElement(By.xpath("//div[@id='fname-error']")), 49, allInputValue.getProperty("InvalidInput"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='lname']")), driver.findElement(By.xpath("//div[@id='lname-error']")), 49, allInputValue.getProperty("InvalidInput"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='company']")), driver.findElement(By.xpath("//div[@id='company-error']")), 25, allInputValue.getProperty("InvalidCompanyName"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='postion']")), driver.findElement(By.xpath("//div[@id='postion-error']")), 25, allInputValue.getProperty("InvalidCompanyName"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//input[@id='phoneNumber']")), driver.findElement(By.xpath("//div[@id='phoneNumber-error']")), 15, allInputValue.getProperty("Invalidphonenumber"));
        UtilityMethods.MaximumInputValidation(driver.findElement(By.xpath("//textarea[@id='targetAudience']")), driver.findElement(By.xpath("//div[@id='targetAudience-error']")), 255, allInputValue.getProperty("InvalidDescription"));     
       	 
	 }
	 public static void ReferralRequestMinimumInputValidation()
	 {
		driver.findElement(By.xpath("//input[@value='Request']")).click();
		UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@id='company']")), driver.findElement(By.xpath("//div[@id='company-error']")), 3, allInputValue.getProperty("InvalidMinInput"));
        UtilityMethods.MinimumInputValidation(driver.findElement(By.xpath("//input[@id='phoneNumber']")), driver.findElement(By.xpath("//div[@id='phoneNumber-error']")), 10, allInputValue.getProperty("InvalidMinphonenumber"));
        	 
	 }
}

