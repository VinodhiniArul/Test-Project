package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	
	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
		//WebDriverManager.edgeDriver().setup();
		WebDriver d =new EdgeDriver();
		String url = "https://demo.guru99.com/test/guru99home/";
		d.navigate().to(url);	
		d.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement frame = d.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
		//d.switchTo().frame(frame);
		//d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		List<WebElement> frame = d.findElements(By.tagName ("iframe"));
		for (int i=0; i<frame.size();i++) {
			try {
				d.switchTo().frame(i);
				d.findElements(By.xpath("//iframe[@id=\"a077aa5e\"]"));
				
		}
			catch(Exception e) {
				System.out.println("image not found"+i);
				d.switchTo().parentFrame();
			}
		
	}


}}
