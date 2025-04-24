package testingmodule1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
	public static void main (String[] args)  {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Acer\\eclipse-workspace\\testingmodule1\\target\\msedgedriver.exe");
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
}
}