package com.hemansu.studentregistration.resources;

import java.io.File;

public class RegistrationConfig {
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
			RegistrationLogger.logError("RegistrationConfig", "getPath", e.toString());
		}
		return "";
	}
}
