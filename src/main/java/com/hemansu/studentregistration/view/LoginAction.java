package com.hemansu.studentregistration.view;

import com.hemansu.studentregistration.controller.LoginDAO;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.model.RegisterBean;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Login loginBean;
	private LoginDAO loginDAOObject=new LoginDAO();
	RegisterBean registerObj = new RegisterBean();
	Muniversity test = new Muniversity();
	
	/**
	 * @return the test
	 */
	public Muniversity getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(Muniversity test) {
		this.test = test;
	}

	/**
	 * @return the registerObj
	 */
	public RegisterBean getRegisterObj() {
		return registerObj;
	}

	/**
	 * @param registerObj the registerObj to set
	 */
	public void setRegisterObj(RegisterBean registerObj) {
		this.registerObj = registerObj;
	}

	/**
	 * @return the loginBean
	 */
	public Login getLoginBean() {
		return loginBean;
	}

	/**
	 * @param loginBean the loginBean to set
	 */
	public void setLoginBean(Login loginBean) {
		this.loginBean = loginBean;
	}
	public String execute(){
		try{
			 test=loginDAOObject.findStudent(getLoginBean());
			//registerObj.setFirstNameStudent(registerObjEntity.getFirstNameStudent());
			System.out.println(test.getFirstNameStudent());
			System.out.println(test.getaId());
		}
		catch(Exception ex){
			ex.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
}
