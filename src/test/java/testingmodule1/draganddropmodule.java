package testingmodule1;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;

public class draganddropmodule {
	
		public static void main (String[] args) throws Throwable {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Acer\\eclipse-workspace\\testingmodule1\\target\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().window().maximize();

			WebElement drag1=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
			WebElement drop1=driver.findElement(By.xpath("//div[text()='Norway']"));
		
			WebElement drag2=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
			WebElement drop2=driver.findElement(By.xpath("//div[text()='Sweden']"));
			
			WebElement drag3=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
			WebElement drop3=driver.findElement(By.xpath("//div[text()='United States']"));
			
			WebElement drag4=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
			WebElement drop4=driver.findElement(By.xpath("//div[text()='Denmark']"));
			
			WebElement drag5=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
			WebElement drop5=driver.findElement(By.xpath("//div[text()='South Korea']"));
			
			WebElement drag6=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
			WebElement drop6=driver.findElement(By.xpath("//div[text()='Italy']"));
			
			WebElement drag7=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
			WebElement drop7=driver.findElement(By.xpath("//div[text()='Spain']"));
		
		Actions mouse=new Actions(driver);
		mouse.dragAndDrop(drag1, drop1).build().perform();
		mouse.dragAndDrop(drag2, drop2).build().perform();
		mouse.dragAndDrop(drag3, drop3).build().perform();
		mouse.dragAndDrop(drag4, drop4).build().perform();
		mouse.dragAndDrop(drag5, drop5).build().perform();
		mouse.dragAndDrop(drag6, drop6).build().perform();
		mouse.dragAndDrop(drag7, drop7).build().perform();
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Acer\\eclipse-workspace\\testingmodule1\\target\\Screenshot.png");
		FileUtils.copyFile(src, destination);
			
		}
	}
}
