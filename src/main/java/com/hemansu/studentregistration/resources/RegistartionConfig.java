package com.hemansu.studentregistration.resources;

import java.io.File;

public class RegistartionConfig {
	public static String getPath(String path) {
		
		try {
			if (path.equalsIgnoreCase("errorLoggerPath")) {
				
				String userHome = System.getProperty("user.home");
				String tillDesktop = userHome + "\\Desktop\\logger\\";
				File myFile = new File(tillDesktop);
				if (!myFile.exists()) {
					myFile.mkdir();
				}
				return tillDesktop + "ErrorLogFile.txt";
			}
			
		}
		catch(Exception e){
			RegistartionLogger.logError("RegistrationConfig", "getPath", e.toString());
		}
		return "";
	}
}
