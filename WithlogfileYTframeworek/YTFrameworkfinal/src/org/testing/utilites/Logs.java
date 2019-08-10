package org.testing.utilites;

import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;

//the class which will take the logs

public class Logs {
	
	public static void takeLogs(String classname,String message)
	{
		DOMConfigurator.configure("C:\\Users\\PC\\eclipse-workspace\\YTFrameworkfinal\\layout.xml");
		Logger l=Logger.getLogger(classname); 
		l.info(message);
		
		
	}
	

}
