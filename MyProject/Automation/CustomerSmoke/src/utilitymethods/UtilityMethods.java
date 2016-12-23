package utilitymethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




import driver.BaseDriver;

public class UtilityMethods extends BaseDriver {

	
	public static void waitForElement(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void PageRedirection(WebElement webObject,WebElement FindElement)
	{
		webObject.click();
		WebDriverWait waitTime = new WebDriverWait(driver, 15);
		WebElement ele = waitTime.until(ExpectedConditions.elementToBeClickable(FindElement));
		if(!ele.isDisplayed())
		{
		System.out.println("There is error in Page redirection");
		}
		
	}
	
	public static void waitForObject(WebDriver driver,String condition,WebElement webObject)
	{
		if(condition!="")
		{
			WebDriverWait wait = new WebDriverWait(driver,Long.parseLong(condition));
			wait.until(ExpectedConditions.visibilityOf(webObject));
		}
		else
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(webObject));
		}
		
	}
	public static void waitForObjectIsClickable(WebDriver driver,WebElement webObject)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(webObject));
		
	}
	public static void PageNavigationValidation(WebElement Linkbutton,WebElement FindElement) 
	{
		waitForElement(Linkbutton);
		Linkbutton.click();	
		//waitForElement(FindElement);	
		try{Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
		boolean Result = true;
		Result= FindElement.isDisplayed();
		System.out.println("The Result is "+Result);
		if(Result==false)
	    {
			System.out.println("Page Navigation Error in "+Linkbutton.getText());	
		}
			
	}
	public static void howItWorksValidation(WebElement webObj,String str1,String str2,String str3)
	{
		String Temp = webObj.getText();
		for (String retval: Temp.split("\n"))
		{
			if(str1.equalsIgnoreCase(retval)){}
			else if(str2.equalsIgnoreCase(retval)){}
			else if(str3.equalsIgnoreCase(retval)){}
			else
			{
				System.out.println("Error in string validation "+retval);
			}
		}
	
	}
	public static void howKitIncludesValidation(WebElement webObj,WebElement webImageObj,String src,String str1)
	{
	String Temp = webObj.getText();
	if(!webImageObj.getAttribute("src").equals(src))
	{
		System.out.println("There is wrong src Porperty in "+webImageObj.getAttribute("alt"));	
	}
		for (String retval: Temp.split("\n"))
		{
			for(String str2:str1.split("///"))
			{
			if(str2.equalsIgnoreCase(retval)){System.out.println("In string validation "+retval);}
			else
			{
				
			}
			}
		}
	}
	
	public static void InputValidation(WebElement Button1,WebElement InputElement,String Input,WebElement Button2)
	{
		for (String retval: Input.split(","))
		{
			try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("The Valid Email Id Is"+retval);
		//	driver.findElement(By.xpath("//div[@class='bl-val-chnge pb25']/a[text()='Track Order']")).click();
			Button1.click();
			try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
			InputElement.clear();
			InputElement.sendKeys(retval);
			Button2.click();
			try {Thread.sleep(2500);}catch (InterruptedException e) {e.printStackTrace();}
			//UtilityMethods.DisplayEnableValidator(driver.findElement(By.xpath("//div[@class='text-center']/a")), "NotEquals", "page navigation Error");
			driver.navigate().back();
		}	
	}
	

	public static void SendInputValues(WebElement webObject,String Input,String type)
	{
		switch (type.toLowerCase()) {
		case "textbox":
			webObject.clear();
			webObject.sendKeys(Input);
			break;
		case "dropdown":
			Select DropDown = new Select(webObject);
			DropDown.selectByVisibleText(Input);
			break;
		case "radiobutton":
			webObject.click();
			break;
		case "checkbox":
			webObject.click();
			break;
		
		}
	}
	public static void NumericFieldValidation(WebElement numericFieldObject,WebElement errorObject,String Input)
	{
		for (String retval: Input.split(","))
		{
			numericFieldObject.clear();
			numericFieldObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid number."))
			{
				if(ErrorMessage.equals(" "))
				{
					System.out.println("Error Message is not displayed near Text box ID "+numericFieldObject.getAttribute("id")+"for input value : '"+retval+" '");
				}
				else
				{
				System.out.println("The Error Message displayed is "+ErrorMessage+" near Text Box ID "+numericFieldObject.getAttribute("id")+" for input value : '"+retval+" '");
		     	}	
			}
		}		
	}
	public static void CCConfirmPasswordValidation(WebElement PasswordObj,WebElement ConfirmPasswordObj,WebElement errorObject,String input)
	{
		PasswordObj.sendKeys(" ");
		for (String pwd: input.split(","))
		{
			ConfirmPasswordObj.clear();	
			ConfirmPasswordObj.sendKeys(pwd);
			String ErrorMessage=errorObject.getText();
			if(!ErrorMessage.equals("Please enter the same value again."))
			{
				System.out.println("Please enter the same value again. error message is not displayed for input "+pwd+"");
			}
		}
	}
	public static void CCPasswordAndConfirmPasswordValidation(WebElement PasswordObj,WebElement ConfirmPasswordObj,WebElement errorObject1,WebElement errorObject2,String Passwordinput)
	{
		String ErrorMessage1 = null,ErrorMessage2 = null;
		for (String pwd: Passwordinput.split(","))
		{
			PasswordObj.clear();
			ConfirmPasswordObj.clear(); 
			PasswordObj.sendKeys(pwd);
			ConfirmPasswordObj.sendKeys(pwd);
			ErrorMessage1=errorObject1.getText();	
			ErrorMessage2= errorObject2.getText();	
			if((!ErrorMessage1.equals(""))||(!ErrorMessage2.equals("")))
			{
			System.out.println("The Error Message displayed near password textbox is "+ErrorMessage1+"for input "+pwd+"");
			System.out.println("The Error Message displayed near Confirmpassword textbox is "+ErrorMessage2+"for input "+pwd+"");
			}
		}
	}
	
	public static void ControlCenterPasswordValidation(WebElement textBoxObject,WebElement errorObject,String input)
	{
		
		for (String retval: input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid password."))
			{
				System.out.println("Please enter a valid password error message is not displayed for input "+retval+"");
			}
		}
	}
	
	public static void ControlCenterRequiredFieldValidation(WebElement textBoxObject,WebElement errorObject,String Type)
	{
		textBoxObject.clear();
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Please enter "+Type+""))
		{
			System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to Please enter "+Type+"");
		}	
	}
	
	public static void EmailIdInvalidvalidation(WebElement textBoxObject,WebElement errorObject,String Input)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter a valid email address."))
			{
				System.out.println("The Error Message displayed is "+ErrorMessage+" near Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
	}
	
	public static void MaximumInputValidation(WebElement textBoxObject,WebElement errorObject,int Maximumvalue,String Input)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter no more than "+Maximumvalue+" characters."))
			{
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
		
	}
	
	public static void MinimumInputValidation(WebElement textBoxObject,WebElement errorObject,int Minimumvalue,String Input)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals("Please enter at least "+Minimumvalue+" characters."))
			{
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}		
	}
	
	public static void SpaceNotAllowedvalidation(WebElement textBoxObject,WebElement errorObject)
	{
		textBoxObject.clear();
		textBoxObject.sendKeys("         ");
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("Spaces not allowed before text"))
		{
			System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to 'Spaces not allowed before text'");
		}
	}
	
	public static void RequiredFieldValidation(WebElement textBoxObject,WebElement errorObject,String type)
	{
		switch(type.toLowerCase())
		{
		case "textbox":
		textBoxObject.clear();
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals("This field is required."))
		{
			System.out.println("The Error Message displayed is "+ErrorMessage+" not equals to 'This field is required.'");
		}
		break;
		case "dropdown":
			Select DropDown = new Select(textBoxObject);
			DropDown.selectByVisibleText("Choose device type");
			String ErrorMessage1= errorObject.getText();
			if(!ErrorMessage1.equals("This field is required."))
			{
				System.out.println("The Error Message displayed is "+ErrorMessage1+" not equals to 'This field is required.'");
			}
			break;
		case"radiobutton":
			String ErrorMessage2= errorObject.getText();
			if(!ErrorMessage2.equals("This field is required."))
			{
				System.out.println("The Error Message displayed is "+ErrorMessage2+" not equals to 'This field is required.'");
			}
			
			break;
		}
	}
	
	public static void ValidateSimTypeRadioButton(int InputValue,WebElement errorObject)
	{
		 List<WebElement> radios = driver.findElements(By.name("simTypeId"));
		    if (InputValue > 0 && InputValue <= radios.size()) {
		        radios.get(InputValue - 1).click();
		    } else {
		        throw new NotFoundException("option " + InputValue + " not found");
		    }

		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals(""))
		{
			System.out.println("The Error Message is "+ErrorMessage+" near Displayed Radio Button ");
		}

	}
	
	public static void ValidateDropDown(WebElement dropDownObject,String InputValue,WebElement errorObject)
	{
		Select DropDown = new Select(dropDownObject);
		DropDown.selectByVisibleText(InputValue);
		String ErrorMessage= errorObject.getText();
		if(!ErrorMessage.equals(""))
		{
			System.out.println("The Error Message is "+ErrorMessage+" near Displayed Drop Down ID "+dropDownObject.getAttribute("id")+" for input value : '"+InputValue+" '");
		}
	}
	
	public static void ValidInputValidation(WebElement textBoxObject,String Input,WebElement errorObject)
	{
		for (String retval: Input.split(","))
		{
			textBoxObject.clear();
			textBoxObject.sendKeys(retval);
			String ErrorMessage= errorObject.getText();
			if(!ErrorMessage.equals(""))
			{
				System.out.println("The Error Message is "+ErrorMessage+" near Displayed Text Box ID "+textBoxObject.getAttribute("id")+" for input value : '"+retval+" '");
			}		
		}	
	}
	
	public static void PlaceholderValidation(WebElement textObject,String stringToCompare,String Result)
	{
		String stringBase=textObject.getAttribute("placeholder");
		if(!stringBase.equalsIgnoreCase(stringToCompare))
		{
			System.out.println("The Placeholder value in "+Result+" Input Field doesn't match.");
		}
		
	}
	
	public static void Imagevalidation(WebElement imgObject,String typeattribute,String value,String Result)
	{
		switch(typeattribute.toLowerCase())
		{
		case "alt":
			if (!imgObject.getAttribute(typeattribute).equals(value))
			{
				System.out.println("The " + Result +" is having wrong Alternate Text Porperty");
			}
			break;
		case "src":	
			if (!imgObject.getAttribute(typeattribute).equals(value))
			{
				
				System.out.println("The " + Result +" is having wrong src Porperty");
			}
			break;
		}	
	}
	
	public static void StringValidation(String stringBase, String stringToCompare,String value)
	{
		boolean result = true;
		
		switch(value.toLowerCase())
		{
		case "equal":
			result = stringBase.equals(stringToCompare);
		break;
		case "equalsignorecase":
			result = stringBase.equalsIgnoreCase(stringToCompare);
		break;
		case "doubleequals":
			result = stringBase==stringToCompare;
		break;
		
		}
		
		if (result == false)
		{
			System.out.println("The String " + stringToCompare +" is not " + value +" to "+ stringBase +" ");
		}
	}
	
	public static void DisplayEnableValidator(WebElement strObject, String value, String Result)
	{
		switch(value.toLowerCase())
		{
		case "equal":
			if (strObject.isDisplayed() && strObject.isEnabled())
			{
				System.out.println("The " + Result +" is Displayed or Enabled");
			}
			break;
		case "notequal":
			if (!strObject.isDisplayed() && !strObject.isEnabled())
			{
				System.out.println("The " + Result +" is not Displayed or Enabled");
			}
			break;
		}	
	}
	
	public static Properties getPropValues() throws IOException 
	{
		
		Properties properties = new Properties();
		String propertiesFile=System.getProperty("user.dir")+ "\\src\\testData.properties";
		try 
		{
			properties.load(new FileInputStream(propertiesFile));
        } 
		catch (IOException e) 
		{
            System.out.println("Exception Occurred" + e.getMessage());
        }
		return properties;
	}

}
