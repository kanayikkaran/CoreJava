package pkg01;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//WebElement ele = driver.findElement(By.xpath("//*[text()='Gmail']"));
		//WebElement ele = driver.findElement(By.linkText("Gmail"));
		WebElement ele = driver.findElement(By.xpath("//a"));
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		
		ele.click();
		//ele.sendKeys("dssfsfsd");
		
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("some random text");
		String alText = al.getText();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		/*WebElement elementWaitedFor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("some random xpath")));
		elementWaitedFor.click();*/
		
		Actions action = new Actions(driver);
		/*action.moveToElement(elementWaitedFor);
		action.build().perform();
		action.doubleClick(elementWaitedFor);
		action.contextClick().build().perform();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\SS\\" + "fileName" + ".jpg"));*/
		
		WebElement dd = driver.findElement(By.xpath("//*[@id='selectMe']"));
		Select dd1 = new Select(dd);
		dd1.selectByIndex(0);
		dd1.getOptions().size();
		
		driver.switchTo().frame(dd); // to goto iframe/frame
		driver.switchTo().defaultContent(); // gotback to the main page.
		driver.switchTo().frame(ele);
		
		String handle = driver.getWindowHandle();
				driver.switchTo().window(handle);
				
				
		driver.close();
		driver.quit();
	}

}
