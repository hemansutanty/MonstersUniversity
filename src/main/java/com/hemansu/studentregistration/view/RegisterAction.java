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
			numOfRows = registerDAOObject.saveStudent(getRegisterBean());
			System.out.println(numOfRows);
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return SUCCESS;
	}
	public void validate(){
		if(registerBean.getFirstNameStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.firstNameStudent", "Please Enter the First Name of the Student");
		}
		if(registerBean.getLastNameStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.lastNameStudent", "Please Enter the Last Name of the Student");
		}
		if(registerBean.getDateOfBirthStudent()==null){
			clearFieldErrors();
			addFieldError("registerBean.dateOfBirthStudent", "Please Enter the Date of Birth of the Student");
		}
		if(registerBean.getEmailStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.emailStudent", "Please Enter the email address of the Student");
		}
		if(registerBean.getGenderStudent()==null){
			clearFieldErrors();
			addFieldError("registerBean.genderStudent", "Please choose a gender option of the Student");
		}
		if(registerBean.getNationalityStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.nationalityStudent", "Please enter the nationality of the Student");
		}
		if(registerBean.getAddressLine1Student().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.addressLine1Student", "Please enter the Address of the Student");
		}
		if(registerBean.getCityStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.cityStudent", "Please enter the City");
		}
		if(registerBean.getStateStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.stateStudent", "Please enter the State");
		}
		if(registerBean.getCountryStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.countryStudent", "Please enter the Country");
		}
		if(registerBean.getZipCodeStudent().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeStudent", "Please enter the Area Zip Code");
		}
		else if(registerBean.getZipCodeStudent().length()!=6){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeStudent", "Area Zip Code should be of 6 digits");
		}
		else if(!registerBean.getZipCodeStudent().matches("[0-9]{6}")){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeStudent", "Area Zip Code should contain digits only");
		}
		if(registerBean.getContactNo1Student().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Student", "Please enter the Contact number of the Student");
		}
		else if(registerBean.getContactNo1Student().length()!=10){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Student", "Phone Number should be of 10 digits");
		}
		else if(!registerBean.getContactNo1Student().matches("[0-9]{10}")){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Student", "Phone Number should contain digits only");
			
		}
		if(registerBean.getGuardianName().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.guardianName", "Please enter the Guardian's name");
		}
		if(registerBean.getAddressLine1Guardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.addressLine1Guardian", "Please enter the address of the Guardian");
		}
		if(registerBean.getCityGuardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.cityGuardian", "Please enter the City");
		}
		if(registerBean.getStateGuardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.stateGuardian", "Please enter the State");
		}
		if(registerBean.getCountryGuardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.countryGuardian", "Please enter the Country");
		}
		if(registerBean.getZipCodeGuardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeGuardian", "Please enter the Area Zip Code");
		}
		else if(registerBean.getZipCodeGuardian().length()!=6){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeGuardian", "Area Zip Code should be of 6 digits");
		}
		else if(!registerBean.getZipCodeGuardian().matches("[0-9]{6}")){
			clearFieldErrors();
			addFieldError("registerBean.zipCodeGuardian", "Area Zip Code should contain digits only");
		}
		if(registerBean.getContactNo1Guardian().length()==0){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Guardian", "Please enter the Contact number of the Guardian");
		}
		else if(registerBean.getContactNo1Guardian().length()!=10){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Guardian", "Phone Number should be of 10 digits");
		}
		else if(!registerBean.getContactNo1Guardian().matches("[0-9]{10}")){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Guardian", "Phone Number should contain digits only");
			
		}
		if(registerBean.getIitjeeRank()==0){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Guardian", "Please enter the Contact number of the Guardian");
		}
		else if(registerBean.getContactNo1Guardian().length()!=10){
			clearFieldErrors();
			addFieldError("registerBean.contactNo1Guardian", "Phone Number should be of 10 digits");
		}
	}
}
