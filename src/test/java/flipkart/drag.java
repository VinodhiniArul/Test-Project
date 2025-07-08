package flipkart;

import java.io.*;
import org.apache.commons.io.FileUtils;  // Correct import


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class drag {
			
		public static void main (String[] args) throws InterruptedException, IOException{
			
			System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
			//WebDriverManager.edgeDriver().setup();
			WebDriver d =new EdgeDriver();
			d.get("https://demo.guru99.com/test/drag_drop.html");
		//	String url = "https://demo.guru99.com/test/drag_drop.html";
		//	d.navigate().to(url);	
			d.manage().window().maximize();
			
			WebElement drag = d.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
			WebElement drop = d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
			WebElement drag1 = d.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			WebElement drop1 = d.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
			WebElement drag11 = d.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			WebElement drop11 = d.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			WebElement drag111 = d.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
			WebElement drop111 = d.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
			Actions a = new Actions(d);
			a.dragAndDrop(drag111, drop111).build().perform();
			a.dragAndDrop(drag11, drop11).build().perform();
			a.dragAndDrop(drag1, drop1).build().perform();
			a.dragAndDrop(drag, drop).build().perform();
			
				TakesScreenshot s = (TakesScreenshot)d;
				File src = s.getScreenshotAs(OutputType.FILE);
				File des = new File("D:\\test\\target\\Screenshot.png");
				FileUtils.copyFile(src,des);
				d.quit();
				
				d.get("https://web.whatsapp.com/	");
		        
		        // Wait for the WhatsApp Web to load and prompt for QR code scanning
		        System.out.println("https://wa.me/qr/NJQGPCD4GHTNJ1");
		        Thread.sleep(30000); // Give you time to scan the QR code (can adjust if needed)

		        // Wait for the search bar to appear
		        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true'][@data-tab='3']")));
		        
		        // Type in the name of the contact/group you want to send the message to
		        searchBox.sendKeys("Sss");

		        // Wait for the contact/group to be found and click on it
		        WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Contact Name or Group Name']")));
		        contact.click();
		        
		        // Locate the attachment button to send the image
		        WebElement attachmentButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='clip']")));
		        attachmentButton.click();
		        
		        // Wait for the file input to appear
		        WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='file']")));
		        
		        // Send the file path of the screenshot
		        fileInput.sendKeys("D:\\test\\target\\Screenshot.png");
		        
		        // Wait for the send button and click it to send the image
		        WebElement sendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-icon='send']")));
		        sendButton.click();
		        
		        // Close the browser
		        d.quit();	



			
			


}}
