package com.hemansu.studentregistration.ui;

import com.hemansu.studentregistration.controller.RegisterDAO;




public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			RegisterDAO obj = new RegisterDAO();
			//System.out.println(obj.findMaxID());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
