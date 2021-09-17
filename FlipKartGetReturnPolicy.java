package assessmentWeek3;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartGetReturnPolicy {
	@Test
	public void getReturnPolicy() throws Exception {
		// 1) Access https://www.flipkart.com/
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath("//span[contains(text(),'Mobile number')]/parent::label/preceding-sibling::input")
				.sendKeys("9600881895");
		driver.findElementByXPath("//span[contains(text(),'Password')]/parent::label/preceding-sibling::input")
				.sendKeys("Asdf1234$");
		driver.findElementByXPath("//span[text()='Login']/parent::button").click();
		Thread.sleep(2000);

		// 2) From the Fashions option select the Men's Bottom Wear
		Actions builder = new Actions(driver);
		WebElement eleFashion = driver.findElementByXPath("//img[@alt='Fashion']");
		builder.moveToElement(eleFashion).build().perform();
		Thread.sleep(2000);

		WebElement eleMenBottomWear = driver.findElementByXPath("//a[contains(text(), 'Bottom Wear')]");
		builder.moveToElement(eleMenBottomWear).click().build().perform();
		Thread.sleep(5000);

		// 3) Adjust the price between 1000 and 2500 (use only the slider option)
		WebElement startSliderPoint = driver.findElementByXPath("(//div[contains(@class,'HQL4QS')])[1]");
		builder.dragAndDropBy(startSliderPoint, 101, 0).build().perform();
		Thread.sleep(2000);

		WebElement endSliderPoint = driver.findElementByXPath("(//div[contains(@class,'HQL4QS')])[2]");
		builder.dragAndDropBy(endSliderPoint, -35, 0).build().perform();
		Thread.sleep(2000);

		// 4) Click on the First item displayed
		String parentWindow = driver.getWindowHandle();
		driver.findElementByXPath("//span[contains(text(), 'Showing')]/parent::div/following::a").click();

		// 5) Get the number of days alone for the return Policy
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				String retrunPolicyText = driver.findElementByXPath("//div[contains(text(), 'Return Policy')]")
						.getText();
				String days = retrunPolicyText.replaceAll("[^0-9]", " ").trim();
				System.out.println(" Return Policy days :" + days);
			}
		}
		
		driver.quit();

	}
}