package Fb.Hooks;

import facebook.utils.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {
		
	Utility utils= new Utility();
		@Before
		public void browserinvoke(Scenario scenario) {
			utils.browserLaunch();
//			final byte []ss=((TakesScreenshot)utils.driver).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(ss,"image/png");
		}
		@After
	    public void browserclose(Scenario scenario) {
//			final byte []ss=((TakesScreenshot)utils.driver).getScreenshotAs(OutputType.BYTES);
//			scenario.embed(ss,"image/png");
			utils.browserclose();
		}

}
