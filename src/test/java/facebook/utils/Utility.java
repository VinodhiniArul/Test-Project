package facebook.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Fb.Hooks.Variables;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility implements Variables {
	
	public static   WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public static JavascriptExecutor js;
	public static Alert alert;
	public static Select select;
	 
	
		public void browserLaunch() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			Actions action =new Actions(driver);
			 js=(JavascriptExecutor)driver;
			}
		public void applicationLaunch(String url) {
			driver.get(url);
		}
		public void sendkey(WebElement ele ,String value) {
			ele.sendKeys(value);
		}
		public void button(WebElement ele) {
			ele.click();
		}
		public void button(WebElement ele,int value) {
			action.click().build().perform();
		}
		public void button(String value,WebElement ele) {
			js.executeScript("arguments[0].setAttribute(value,'"+value+"');", ele);
		}
		 public void ss(String filename) {
			   TakesScreenshot snap= (TakesScreenshot)driver ;
			   File scr=snap.getScreenshotAs(OutputType.FILE);
			   File des=new File(".\\target\\"+filename+".png");
			   try{
				   FileUtils.copyFile(scr, des);
			   }catch (IOException e) {
				e.printStackTrace();
			}
		   }
		   public String getText(WebElement ele) {
			   String text=ele.getText();
			   return text;
		   }
		   public String getAttribute(WebElement ele,String att) {
			   String attribute=ele.getAttribute(att);
			   return attribute;
		   }
		   public String getCssValue(WebElement ele,String css) {
			   String cssvalue=ele.getCssValue(css);
			   return cssvalue;
		   }
			public void browserQuit() {
				driver.quit();
			}
		public void clear (WebElement ele) {
			ele.clear();
		}
		public void navigateBack(String url) {
			driver.navigate().back();
		}
		public void navigateForword(String url) {
			driver.navigate().forward();
		}
		public void navigateRefresh(String url) {
			driver.navigate().refresh();
		}
		public void browserclose() {
			driver.close();
		}
		public void doubleClick(WebElement ele) {
			action.doubleClick(ele);
		}
		public void contextClick(WebElement ele) {
			action.contextClick(ele);
		}
	    public void sendKeysUsingActions(WebElement element, String text) {       
	        action.moveToElement(element).click().sendKeys(text).build().perform();
	    }
	    public void dragdrop(WebElement text1, WebElement text) {
	        action.dragAndDrop(text1,text).build().perform();;
	    }
	    public void acceptAlert () {
		  alert =driver.switchTo().alert();
		  alert.accept();
	    }
	    public void alertsendkeys (String ele) {
	  	  alert =driver.switchTo().alert();
	  	  alert.sendKeys(ele);
	      }
	    public void dismissAlert () {
		  alert =driver.switchTo().alert();
		  alert.dismiss();
	   } 
	   public String getAlertText () {
		  alert =driver.switchTo().alert();
		  String val= alert.getText();
		  return val;
	   }
	   public void dropdown(String val,WebElement ele) {
		   Select  select=new Select(ele);
		   select.selectByVisibleText(val);
	   }
	  public String pagesource () {
		 String url=driver.getPageSource();
		 return url;
	  }
	  public String pageurl () {
		 String url=driver.getCurrentUrl();
		 return url;
	  }
	  public void scrollDown(WebElement down) {
		  js.executeScript("arguments[0].ScrollIntoView(false)", down);
	  }
	  public void scrollUp(WebElement up) {
		  js.executeScript("arguments[0].ScrollIntoView(true)", up);
	  }
	  public String currentTab() {
		  String currenttab=driver.getWindowHandle();
		  return currenttab;
	  }
	  public void frame(WebElement ele) {
		  driver.switchTo().frame(ele);
	  }
	  public void parentFrame() {
		  driver.switchTo().parentFrame();
	  }
	  public void defaultFrame() {
		  driver.switchTo().defaultContent();
	  }
	  public void submit(WebElement ele) {
		  ele.submit();
	  }
	  public void multiWindow (String value) {	  
		  Set<String> alltab = driver.getWindowHandles();	  
		  for (String current: alltab) {	  
		  driver.switchTo().window(current);
		  	  	  if(driver.getTitle()==value) {	 
		  break;	  
		  }}}
	  public void isSelected (WebElement ele) {
		  if(ele.isSelected()) {
		  System.out.println("Ele is selected");
		  }
		  else {
		  System.out.println("Ele is not selected");
		  }}
	 
		  public void isEnabled (WebElement ele) {
		  if(ele.isEnabled()) {
		  System.out.println("Ele is enabled");}
		  else {
		  System.out.println("Ele is not enabled");
		  }	  }
	 
		  public void isDisplayed (WebElement ele) {
		  if(ele.isDisplayed()) {
		  System.out.println("Ele is displayed");
		  }
		  else {
		  System.out.println("Ele is not displayed");
		  }
	 
		  }
	
	


	
	

}
