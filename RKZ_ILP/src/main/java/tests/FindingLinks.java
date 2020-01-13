package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import tests.QCStore;

import com.relevantcodes.extentreports.LogStatus;
public class FindingLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("http://google.com/");
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 1; i<=links.size(); i=i+1)
		{
			//System.out.println(links.get(i).getText());
			String LinkNames=links.get(i).getText();
			System.out.println(LinkNames);						
		}
	}
}