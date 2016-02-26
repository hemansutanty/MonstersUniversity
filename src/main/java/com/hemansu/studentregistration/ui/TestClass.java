package com.hemansu.studentregistration.ui;

import com.hemansu.studentregistration.controller.LoginDAO;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Muniversity;



public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Login loginObj = new Login();
			loginObj.setColgId(31);
			loginObj.setPassword("heman@123");
			Muniversity registerObj = new Muniversity();
			LoginDAO obj = new LoginDAO();
			registerObj = obj.findStudent(loginObj);
			System.out.println(registerObj.getaId());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
