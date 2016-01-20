package com.hemansu.studentregistration.ui;

import com.hemansu.studentregistration.controller.LoginDAO;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Register;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Login loginBean = new Login();
			loginBean.setColgId(17);
			loginBean.setPassword("heman");
			LoginDAO loginDAOObj = new LoginDAO();
			Register registerObj = loginDAOObj.findStudent(loginBean);
			System.out.println(registerObj.getFirstNameStudent());
			System.out.println(registerObj.getaId());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
