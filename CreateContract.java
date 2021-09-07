package assessmentWeek2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContract {

	@Test
	public void createContractSales() throws Exception {

		//Launching application
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//1. Login
		driver.findElementByXPath("//input[@id='username']").sendKeys("earth@testleaf.com");
		driver.findElementByXPath("//input[@id='password']").sendKeys("Bootcamp$123");
		driver.findElementByXPath("//input[@id='Login']").click();
		
		//2. Click on the toggle menu button from the left corner
		
		driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
		
		//3. Click View All and click 'Contract' from App Launcher
		driver.findElementByXPath("//button[text()='View All']").click();
		WebElement contractsLink = driver.findElementByXPath("//p[text()='Contracts']");
		driver.executeScript("arguments[0].click();", contractsLink);
		
		//4. Click on the Dropdown icon in the Contract tab
		driver.findElementByXPath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']").click();
		
		//5. Click on New Contract
		WebElement clickNewContract = driver.findElementByXPath("//span[text()='New Contract']");
		driver.executeScript("arguments[0].click();", clickNewContract);
		
		//6. Select the accounts listed on the'Account Name' field
		driver.findElementByXPath("(//div[@class='autocompleteWrapper slds-grow']/input)[1]").click();
		driver.findElementByXPath("(//li[@class='lookup__item  default uiAutocompleteOption forceSearchInputLookupDesktopOption']/a)[3]").click();
	
		//7.Select the Contract Start Date as Tommorow's Date
		driver.findElementByXPath("//div[@class='form-element']/input").sendKeys("9/8/2021");
		
		//8.Enter Contract Term (months) as' 6 '
		driver.findElementByXPath("//input[@class='input uiInputSmartNumber']").sendKeys("6");
		
		//9.Click save
		
		driver.findElementByXPath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']").click();
		
		//10.Get the Contract numberExpected Result:The new Contract is created Successfully
		Thread.sleep(5000);
		WebElement contractNumber = driver.findElementByXPath("//span[@class='uiOutputText']");
		String txtcontractNumber = contractNumber.getText();
		
		System.out.println("Contract Created Successfully and contract Number :"+txtcontractNumber);
	}

}
