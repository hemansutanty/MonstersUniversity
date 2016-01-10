package com.hemansu.studentregistration.view;

import java.util.Arrays;
import java.util.List;

import com.hemansu.studentregistration.controller.RegisterDAO;
import com.hemansu.studentregistration.model.Register;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Register registerBean;
	private String[] genders = {"Male", "Female", "Not Sure"};
	private RegisterDAO registerDAOObject;
	
	public RegisterAction(){
		registerDAOObject = new RegisterDAO();
	}
	/**
	 * @return the registerBean
	 */
	public Register getRegisterBean() {
		return registerBean;
	}
	/**
	 * @param registerBean the registerBean to set
	 */
	public void setRegisterBean(Register registerBean) {
		this.registerBean = registerBean;
	}
	/**
	 * @return the genders
	 */
	public List<String> getGenders() {
		
		return Arrays.asList(genders);
		
	}
	public String execute(){
		Integer numOfRows = null;
		try{
			//System.out.println("Inside addDetails of RegisterAction");
			numOfRows = registerDAOObject.saveStudent(getRegisterBean());
			System.out.println(numOfRows);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return SUCCESS;
	}
}
