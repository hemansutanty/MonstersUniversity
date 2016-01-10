package com.hemansu.studentregistration.ui;

import com.hemansu.studentregistration.controller.RegisterDAO;
import com.hemansu.studentregistration.model.Register;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Register register = new Register();
			//register.setaFirstName("Hemansu");
			//register.setaLastName("Tanty");
			RegisterDAO obj = new RegisterDAO();
			obj.saveStudent(register);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
