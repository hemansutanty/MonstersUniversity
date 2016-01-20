package com.hemansu.studentregistration.view;

import com.hemansu.studentregistration.controller.LoginDAO;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Register;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Login loginBean;
	private LoginDAO loginDAOObject=new LoginDAO();
	
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
		//System.out.println(getLoginBean().getColgId()+"\t"+getLoginBean().getPassword());
		try{
			Register registerObj=loginDAOObject.findStudent(getLoginBean());
			System.out.println(registerObj.getFirstNameStudent());
		}
		catch(Exception ex){
			ex.printStackTrace();
			//return INPUT;
		}
		return SUCCESS;
	}
}
