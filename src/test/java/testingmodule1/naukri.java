package testingmodule1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class naukri {
	
public static void main (String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
		//WebDriverManager.edgeDriver().setup();
		WebDriver d =new EdgeDriver();
		String url = "https://www.naukri.com/registration/createAccount?othersrcp=22636";
		d.navigate().to(url);	
		d.manage().window().maximize();
		
	WebElement c = d.findElement(By.xpath("//div[@class='radioWrap']//following::h2[contains(text(), \"I'm experienced\")]"));
    c.click();
    Thread.sleep(2000);
    WebElement resume = d.findElement(By.xpath("//button[text()='Upload Resume']"));
resume.click();
Runtime.getRuntime().exec("C:\\Users\\selva\\OneDrive\\Desktop\\Suba Resume");

}
}