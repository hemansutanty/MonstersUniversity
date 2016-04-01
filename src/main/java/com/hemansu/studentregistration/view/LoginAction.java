package com.hemansu.studentregistration.view;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.hemansu.studentregistration.controller.LoginDAO;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.model.RegisterBean;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Login loginBean;
	private LoginDAO loginDAOObject=new LoginDAO();
	RegisterBean registerObj = new RegisterBean();
	Muniversity test = new Muniversity();
	SessionMap<String, String> sessionmap;
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
			 if(test!=null){
				 return SUCCESS;
			 }
			 else{
				 return ERROR;
			 }
		}
		catch(Exception ex){
			addActionError(ex.getMessage());
			ex.printStackTrace();
			return ERROR;
		}
	}
	public void validate(){
		//clearFieldErrors();clearErrors();
		if(loginBean.getColgId()==null || loginBean.getColgId()==0){
			addFieldError("loginBean.colgId","Please Enter a College ID");
		}
		if((loginBean.getColgId().toString()).matches("[^0-9]+")){
			addFieldError("loginBean.colgId","Please provide a valid College ID");
		}
		if(loginBean.getPassword()==null || loginBean.getPassword().equals("")){
			addFieldError("loginBean.password","Please provide your password");
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionmap = (SessionMap) map;
		sessionmap.put("login", "true");
	}
	@SkipValidation
	public String logout(){
		sessionmap.invalidate();
		return SUCCESS;
	}
}
