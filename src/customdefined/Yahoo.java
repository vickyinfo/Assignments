package customdefined;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	static WebDriver driver;
	 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji\\work space\\customdefined\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://in.search.yahoo.com/");
    driver.findElement(By.id("yschsp")).sendKeys("selenium",Keys.ENTER);
    
    gottopage("41-50");
	 
	 }
	 
	 
	 
	 
	public  static void gottopage(String pagenum) {
		 String locator = "//a[@title='Results $']";
		 locator = locator.replace("$", pagenum);
	driver.findElement(By.xpath(locator)).click();
}
		
		

//	}

}



//a[@title='Results 1-10']/