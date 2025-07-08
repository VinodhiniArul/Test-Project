package testingmodule1;

import java.util.ArrayList;
import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class mobiles {
	
public static void main (String[] args){
		
		System.setProperty("webdriver.edge.driver", "D:\\test\\target\\msedgedriver.exe");
		//WebDriverManager.edgeDriver().setup();
		WebDriver d =new EdgeDriver();
		String url = "https://www.flipkart.com/?affid=rohanpouri&affExtParam1=ENKR20241124A1205132092&affExtParam2=4037213&gad_source=1&gclid=Cj0KCQiAlbW-BhCMARIsADnwaspS5DYmxyCPgZan3h7z1oG39seC84LJymFtAEwQ6lzp5i865EDqsUMaAks9EALw_wcB";
		d.navigate().to(url);
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("OPPO",Keys.ENTER);
		d.findElement(By.xpath("(//div[@class=\"KzDlHZ\"])[1]")).click();
		d.findElement(By.xpath("(//div[@class=\'KzDlHZ\'])[2]")).click();
		d.findElement(By.xpath("(//div[@class=\'KzDlHZ\'])[3]")).click();
		d.findElement(By.xpath("(//div[@class=\'KzDlHZ\'])[4]")).click();
		String parent = d.getWindowHandle();
		System.out.println(parent);
		Set<String> allurl = d.getWindowHandles();
		System.out.println(allurl);
		List<String> s = new ArrayList<String> (allurl);
		d.switchTo().window(s.get(4));
		
		
		
	//	for (String x:allurl) {
		//	if(!x.equals(parent)) {
				//d.switchTo().window(x);
		
			//}
		//}
		
//String text = d.findElement(By.xpath("(//div[text()='₹39,999'])")).getText();

//System.out.println(text);
}
}