package org.testing.testscript;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Video_Play;
import org.testing.utilites.Screenshot;
import org.testng.annotations.Test;

public class TC3 extends Base {
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		Login l=new Login(driver, pr);
		l.signin("himanshu.a007@gmail.com", "creative");
		
		Video_Play v=new Video_Play(driver, pr);
		v.video(); 
		
		Screenshot.takescreenshot(driver, "C:\\Users\\PC\\eclipse-workspace\\YTFrameworkfinal\\Screenshots folder\\TC3.png");
	}

}
