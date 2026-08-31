package P1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GrowTechMindsIframe {
	public static void main(String[] args) throws InterruptedException {
		
	/*/	ChromeOptions options=new ChromeOptions();This is use for using chrome options present.Ex-launching headless broweser.
		options.addArguments("incognito");// For without showing chrome browser have to pass "headless" inside "addArguments"/*/
		
		ChromeDriver driver =new ChromeDriver();//ChromeDriver driver =new ChromeDriver(options);for ChromeOptions
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(12000);
		WebElement chatbot=driver.findElement(By.xpath("//div[@class='chat-bot-launcher-button']"));
		chatbot.click();
		Thread.sleep(3000);
		
		WebElement  iframe=driver.findElement(By.id("chat-bot-iframe"));
		             driver.switchTo().frame(iframe);
		             Thread.sleep(5000);
	
	    WebElement name=driver.findElement(By.xpath("//textarea[@placeholder='Type an answer']"));
	    name.sendKeys("sunny"+Keys.ENTER);
	    Thread.sleep(5000);
	    driver.switchTo().defaultContent();
	   WebElement e3= driver.findElement(By.xpath("(//ul[@id='menu-1-10edec5']/li)[2]"));
	   e3.click();
		
	}
}
