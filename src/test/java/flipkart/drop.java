package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class drop {
	
	public static void main (String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
		//WebDriverManager.edgeDriver().setup();
		WebDriver d =new EdgeDriver();
		d.get("https://demo.guru99.com/test/drag_drop.html");
	//	String url = "https://demo.guru99.com/test/drag_drop.html";
	//	d.navigate().to(url);	
		d.manage().window().maximize();

}
