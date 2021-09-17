package assessmentWeek3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printWebTable {
	@Test
	public void printWebTableSelenium() throws InterruptedException {
		// Launching application
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<WebElement> rowElements = driver.findElementsByXPath("//table[@id='customers']/tbody/tr");
		List<WebElement> colElements = driver.findElementsByXPath("//table[@id='customers']/tbody/tr[1]/th");
		int rowCount = rowElements.size();
		int colCount = colElements.size();

		System.out.println("Row Count :" + rowCount + " Col Count :" + colCount);
		for (int j = 1; j <= colCount; j++) {
			WebElement eleEachCol = driver.findElementByXPath("//table[@id='customers']/tbody/tr[1]/th[" + j + "]");
			String headerText = eleEachCol.getText();
			System.out.print(headerText + " | ");
		}
		System.out.println("");
		for (int i = 2; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				WebElement eleEachCol = driver
						.findElementByXPath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]");
				String colText = eleEachCol.getText();
				System.out.print(colText + " | ");
			}
			System.out.println("");
		}

		driver.close();
	}

}
