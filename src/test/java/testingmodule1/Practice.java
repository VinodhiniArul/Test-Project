package testingmodule1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice {
	
public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
		//WebDriverManager.edgeDriver().setup();
		WebDriver d =new EdgeDriver();
		String url = "https://www.facebook.com/";
		d.navigate().to(url);	
		d.manage().window().maximize();
		//WebElement insuranceLink = d.findElement(By.xpath ("//a[contains(text(), 'Insurance Project')]"));
      //  insuranceLink.click();
      //  WebElement register = d.findElement(By.xpath ("//a[contains(@class, \"btn btn-default\")]"));
      //  register.click();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("mail")).sendKeys("Vinodhinihasini14@gmail.com");

}}
