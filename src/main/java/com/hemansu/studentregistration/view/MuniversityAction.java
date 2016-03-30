package com.hemansu.studentregistration.view;

import java.util.Arrays;
import java.util.List;
import com.hemansu.studentregistration.controller.RegisterDAO;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.model.RegisterBean;
import com.opensymphony.xwork2.ActionSupport;

public class MuniversityAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Muniversity registerBean;
	private String[] genders = {"Male", "Female", "Not Sure"};
	private RegisterDAO registerDAOObject;
	private RegisterBean registerBeanObj;
	
	public MuniversityAction(){
		registerDAOObject = new RegisterDAO();
	}
	/**
	 * @return the registerBean
	 */
	public Muniversity getRegisterBean() {
		return registerBean;
	}
	/**
	 * @param registerBean the registerBean to set
	 */
	public void setRegisterBean(Muniversity registerBean) {
		this.registerBean = registerBean;
	}
	
	/**
	 * @return the registerBeanObj
	 */
	public RegisterBean getRegisterBeanObj() {
		return registerBeanObj;
	}
	/**
	 * @param registerBeanObj the registerBeanObj to set
	 */
	public void setRegisterBeanObj(RegisterBean registerBeanObj) {
		this.registerBeanObj = registerBeanObj;
	}
	/**
	 * @return the genders
	 */
	public List<String> getGenders() {
		
		return Arrays.asList(genders);
		
	}
	public String getDefaultGenderValue(){
		return "Not Sure";
	}
	public String execute(){
		try{
			registerDAOObject.saveStudent(getRegisterBean());
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return SUCCESS;
	}
	public void validate(){
		
		clearFieldErrors();clearErrors();
		if(registerBean.getFirstNameStudent().length()==0){
			addFieldError("registerBean.firstNameStudent", "Please Enter the First Name of the Student");
		}
		if(registerBean.getLastNameStudent().length()==0){
			addFieldError("registerBean.lastNameStudent", "Please Enter the Last Name of the Student");
		}
		if(registerBean.getDateOfBirthStudent()==null){
			addFieldError("registerBean.dateOfBirthStudent", "Please Enter the Date of Birth of the Student");
		}
		if(registerBean.getEmailStudent().length()==0){
			addFieldError("registerBean.emailStudent", "Please Enter the email address of the Student");
		}
		if(registerBean.getGenderStudent()==null){
			addFieldError("registerBean.genderStudent", "Please choose your gender");
		}
		if(registerBean.getNationalityStudent().length()==0){
			addFieldError("registerBean.nationalityStudent", "Please enter the nationality of the Student");
		}
		if(registerBean.getAddressLine1Student().length()==0){
			addFieldError("registerBean.addressLine1Student", "Please enter the Address of the Student");
		}
		if(registerBean.getCityStudent().length()==0){
			addFieldError("registerBean.cityStudent", "Please enter the City");
		}
		if(registerBean.getStateStudent().length()==0){
			addFieldError("registerBean.stateStudent", "Please enter the State");
		}
		if(registerBean.getCountryStudent().length()==0){
			addFieldError("registerBean.countryStudent", "Please enter the Country");
		}
		if(registerBean.getZipCodeStudent().length()==0){
			addFieldError("registerBean.zipCodeStudent", "Please enter the Area Zip Code");
		}
		if(registerBean.getZipCodeStudent().length()!=0 && !registerBean.getZipCodeStudent().matches("[0-9]{6}")){
			addFieldError("registerBean.zipCodeStudent", "Area Zip Code should contain 6 digits exactly");
		}
		if(registerBean.getContactNo1Student().length()==0){
			addFieldError("registerBean.contactNo1Student", "Please enter the Contact number of the Student");
		}
		if(registerBean.getContactNo1Student().length()!=0 && !registerBean.getContactNo1Student().matches("[0-9]{10}")){
			addFieldError("registerBean.contactNo1Student", "Contact number should contain 10 digits exactly");
		}
		if(registerBean.getContactNo2Student().length()!=0 && !registerBean.getContactNo2Student().matches("[0-9]{10}")){
			addFieldError("registerBean.contactNo2Student", "Contact number should contain 10 digits exactly");
		}
		if(registerBean.getGuardianName().length()==0){
			addFieldError("registerBean.guardianName", "Please enter the Guardian's name");
		}
		if(registerBean.getAddressLine1Guardian().length()==0){
			addFieldError("registerBean.addressLine1Guardian", "Please enter the address of the Guardian");
		}
		if(registerBean.getCityGuardian().length()==0){
			addFieldError("registerBean.cityGuardian", "Please enter the City");
		}
		if(registerBean.getStateGuardian().length()==0){
			addFieldError("registerBean.stateGuardian", "Please enter the State");
		}
		if(registerBean.getCountryGuardian().length()==0){
			addFieldError("registerBean.countryGuardian", "Please enter the Country");
		}
		if(registerBean.getZipCodeGuardian().length()==0){
			addFieldError("registerBean.zipCodeGuardian", "Please enter the Area Zip Code");
		}
		if(registerBean.getZipCodeGuardian().length()!=0 && !registerBean.getZipCodeGuardian().matches("[0-9]{6}")){
			addFieldError("registerBean.zipCodeStudent", "Area Zip Code should contain 6 digits exactly");
		}
		if(registerBean.getContactNo1Guardian().length()==0){
			addFieldError("registerBean.contactNo1Guardian", "Please enter the Contact number of the Guardian");
		}
		if(registerBean.getContactNo1Guardian().length()!=0 && !registerBean.getContactNo1Guardian().matches("[0-9]{10}")){
			addFieldError("registerBean.contactNo1Guardian", "Contact number should contain 10 digits exactly");
		}
		if(registerBean.getContactNo2Guardian().length()!=0 && !registerBean.getContactNo2Guardian().matches("[0-9]{10}")){
			addFieldError("registerBean.contactNo2Guardian", "Contact number should contain 10 digits exactly");
		}
		if(registerBean.getIitjeeRank()==0){
			addFieldError("registerBean.iitjeeRank", "Please enter IITJEE rank");
		}
		if(registerBean.getPercentage12th()==null){
			addFieldError("registerBean.percentage12th", "Please enter percentage in 12th");
		}
		if(registerBean.getPercentage10th()==null){
			addFieldError("registerBean.percentage10th", "Please enter percentage in 10th");
		}
		if(registerBean.getPassword().length()==0){
			addFieldError("registerBean.password", "Please enter Password");
		}
	}
}
