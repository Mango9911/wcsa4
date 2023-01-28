package genericPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Worklib extends BaseTest {
	static WebDriver driver;
	public void handleFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	public void handleFrameByframeElement(WebElement framElement)
	{
		driver.switchTo().frame(framElement);
	}

	public void handleFrameByNameOrId(String name)
	{
		driver.switchTo().frame(name);
	}
	public void rightClick(WebElement target )
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
		
	}
	
}
