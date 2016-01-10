package com.hemansu.studentregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="register")
public class Register implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//personal Information attributes
	//a is for applicant
	@Id
	@GeneratedValue
	private int aId;
	@Column(name="afirstname")
	private String firstNameStudent;
	@Column(name="amiddlename")
	private String middleNameStudent;
	@Column(name="alastname")
	private String lastNameStudent;
	@Column(name="adateofbirth")
	@Temporal(TemporalType.DATE)
	private Date aDateOfBirth;
	@Column(name="aemail")
	private String aEmail;
	@Column(name="agender")
	private String aGender;
	@Column(name="anationality")
	private String aNationality;
	
	//Address and contact of the applicant attributes
	@Column(name="aaddressline1")
	private String aAddressLine1;
	@Column(name="aaddressline2")
	private String aAddressLine2;
	@Column(name="acity")
	private String aCity;
	@Column(name="astate")
	private String aState;
	@Column(name="acountry")
	private String aCountry;
	@Column(name="azipcode")
	private String aZipCode;
	@Column(name="acontactno1")
	private String aContactNo1;
	@Column(name="acontactno2")
	private String aContactNo2;
	
	//Guardian Information
	//g is for guardian
	@Column(name="gguardianname")
	private String gGuardianName;
	@Column(name="gaddressline1")
	private String gAddressLine1;
	@Column(name="gaddressline2")
	private String gAddressLine2;
	@Column(name="gcity")
	private String gCity;
	@Column(name="gstate")
	private String gState;
	@Column(name="gcountry")
	private String gCountry;
	@Column(name="gzipcode")
	private String gZipCode;
	@Column(name="gcontactno1")
	private String gContactNo1;
	@Column(name="gcontactno2")
	private String gContactNo2;
	
	//Required for Admission Details
	@Column(name="arank")
	private int aRank;
	@Column(name="a12thpercentage")
	private int a12thPercentage;
	@Column(name="a10thpercentage")
	private int a10thPercentage;
	@Column(name="apassword")
	private String aPassword;
	/**
	 * @return the firstNameStudent
	 */
	public String getFirstNameStudent() {
		return firstNameStudent;
	}
	/**
	 * @param firstNameStudent the firstNameStudent to set
	 */
	public void setFirstNameStudent(String firstNameStudent) {
		this.firstNameStudent = firstNameStudent;
	}
	/**
	 * @return the middleNameStudent
	 */
	public String getMiddleNameStudent() {
		return middleNameStudent;
	}
	/**
	 * @param middleNameStudent the middleNameStudent to set
	 */
	public void setMiddleNameStudent(String middleNameStudent) {
		this.middleNameStudent = middleNameStudent;
	}
	/**
	 * @return the lastNameStudent
	 */
	public String getLastNameStudent() {
		return lastNameStudent;
	}
	/**
	 * @param lastNameStudent the lastNameStudent to set
	 */
	public void setLastNameStudent(String lastNameStudent) {
		this.lastNameStudent = lastNameStudent;
	}
}
