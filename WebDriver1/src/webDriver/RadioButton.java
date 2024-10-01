package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Soft\\eclipse drivers\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='img sp_98fCI7IVTTz sx_c4643a']")).click();
		java.util.List<WebElement> Day=driver.findElements(By.xpath("//select[@id='day']/option"));
		Day.get(0).click();
		
		WebElement female=driver.findElement(By.xpath("//input[@value='1']"));
		if(female.isDisplayed()) {
			if(female.isEnabled()) {
				female.click();
			}
		}
		System.out.println("hii");
		
	}

}
