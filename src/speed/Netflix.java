package speed;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Netflix {
	static WebDriver driver;
	 public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji\\work space\\customdefined\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://fast.com/");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);	
	WebElement TxtBoxContent = driver.findElement(By.id("speed-value"));
	 String print = TxtBoxContent.getText();
	 System.out.println(print);
	
	//System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
	//WebDriverWait wait = new WebDriverWait(driver, 100);
	
	//wait.until(ExpectedConditions.invisibilityOfElementWithText(by, strText));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//wait.until(ExpectedConditions.textToBePresentInElement(By.id("speed-value").);
//	WebElement text = driver.findElement(By.id("speed-value"));
	//String print = text.getAttribute("value");
//	System.out.println(print);
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
 // driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("mobile",Keys.ENTER);

}

}