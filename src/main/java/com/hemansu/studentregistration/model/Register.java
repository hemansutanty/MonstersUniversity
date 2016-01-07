package com.hemansu.studentregistration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="register")
public class Register {
	
	//personal Information attributes
	//a is for applicant
	@Id
	@GeneratedValue
	@Column
	private long aId;
	@Column
	private String aFirstname;
	@Column
	private String aMiddlename;
	@Column
	private String aLastname;
	@Column
	private Date aDateOFBirth;
	@Column
	private String aEmail;
	@Column
	private String aGender;
	@Column
	private String aNationality;
	
	//Address and contact of the applicant attributes
	@Column
	private String aAddressLine1;
	@Column
	private String aAddressLine2;
	@Column
	private String aCity;
	@Column
	private String aState;
	@Column
	private String aCountry;
	@Column
	private String aZipCode;
	@Column
	private String aContactNo1;
	@Column
	private String aContactNo2;
	
	//Guardian Information
	//g is for guardian
	
	@Column
	private String gGuardianName;
	@Column
	private String gAddressLine1;
	@Column
	private String gAddressLine2;
	@Column
	private String gCity;
	@Column
	private String gState;
	@Column
	private String gCountry;
	@Column
	private String gZipCode;
	@Column
	private String gContactNo1;
	@Column
	private String gContactNo2;
	
	//Required for Admission Details
	@Column
	private long aRank;
	@Column
	private int a12thPercentage;
	@Column
	private int a10thPercentage;
	@Column
	private String aPassword;
	@Column
	private String aBranch;

	/**
	 * @return the aId
	 */
	public long getaId() {
		return aId;
	}

	/**
	 * @param aId the aId to set
	 */
	public void setaId(long aId) {
		this.aId = aId;
	}

	/**
	 * @return the aFirstname
	 */
	public String getaFirstname() {
		return aFirstname;
	}

	/**
	 * @param aFirstname the aFirstname to set
	 */
	public void setaFirstname(String aFirstname) {
		this.aFirstname = aFirstname;
	}

	/**
	 * @return the aMiddlename
	 */
	public String getaMiddlename() {
		return aMiddlename;
	}

	/**
	 * @param aMiddlename the aMiddlename to set
	 */
	public void setaMiddlename(String aMiddlename) {
		this.aMiddlename = aMiddlename;
	}

	/**
	 * @return the aLastname
	 */
	public String getaLastname() {
		return aLastname;
	}

	/**
	 * @param aLastname the aLastname to set
	 */
	public void setaLastname(String aLastname) {
		this.aLastname = aLastname;
	}

	/**
	 * @return the aDateOFBirth
	 */
	public Date getaDateOFBirth() {
		return aDateOFBirth;
	}

	/**
	 * @param aDateOFBirth the aDateOFBirth to set
	 */
	public void setaDateOFBirth(Date aDateOFBirth) {
		this.aDateOFBirth = aDateOFBirth;
	}

	/**
	 * @return the aEmail
	 */
	public String getaEmail() {
		return aEmail;
	}

	/**
	 * @param aEmail the aEmail to set
	 */
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	/**
	 * @return the aGender
	 */
	public String getaGender() {
		return aGender;
	}

	/**
	 * @param aGender the aGender to set
	 */
	public void setaGender(String aGender) {
		this.aGender = aGender;
	}

	/**
	 * @return the aNationality
	 */
	public String getaNationality() {
		return aNationality;
	}

	/**
	 * @param aNationality the aNationality to set
	 */
	public void setaNationality(String aNationality) {
		this.aNationality = aNationality;
	}

	/**
	 * @return the aAddressLine1
	 */
	public String getaAddressLine1() {
		return aAddressLine1;
	}

	/**
	 * @param aAddressLine1 the aAddressLine1 to set
	 */
	public void setaAddressLine1(String aAddressLine1) {
		this.aAddressLine1 = aAddressLine1;
	}

	/**
	 * @return the aAddressLine2
	 */
	public String getaAddressLine2() {
		return aAddressLine2;
	}

	/**
	 * @param aAddressLine2 the aAddressLine2 to set
	 */
	public void setaAddressLine2(String aAddressLine2) {
		this.aAddressLine2 = aAddressLine2;
	}

	/**
	 * @return the aCity
	 */
	public String getaCity() {
		return aCity;
	}

	/**
	 * @param aCity the aCity to set
	 */
	public void setaCity(String aCity) {
		this.aCity = aCity;
	}

	/**
	 * @return the aState
	 */
	public String getaState() {
		return aState;
	}

	/**
	 * @param aState the aState to set
	 */
	public void setaState(String aState) {
		this.aState = aState;
	}

	/**
	 * @return the aCountry
	 */
	public String getaCountry() {
		return aCountry;
	}

	/**
	 * @param aCountry the aCountry to set
	 */
	public void setaCountry(String aCountry) {
		this.aCountry = aCountry;
	}

	/**
	 * @return the aZipCode
	 */
	public String getaZipCode() {
		return aZipCode;
	}

	/**
	 * @param aZipCode the aZipCode to set
	 */
	public void setaZipCode(String aZipCode) {
		this.aZipCode = aZipCode;
	}

	/**
	 * @return the aContactNo1
	 */
	public String getaContactNo1() {
		return aContactNo1;
	}

	/**
	 * @param aContactNo1 the aContactNo1 to set
	 */
	public void setaContactNo1(String aContactNo1) {
		this.aContactNo1 = aContactNo1;
	}

	/**
	 * @return the aContactNo2
	 */
	public String getaContactNo2() {
		return aContactNo2;
	}

	/**
	 * @param aContactNo2 the aContactNo2 to set
	 */
	public void setaContactNo2(String aContactNo2) {
		this.aContactNo2 = aContactNo2;
	}

	/**
	 * @return the gGuardianName
	 */
	public String getgGuardianName() {
		return gGuardianName;
	}

	/**
	 * @param gGuardianName the gGuardianName to set
	 */
	public void setgGuardianName(String gGuardianName) {
		this.gGuardianName = gGuardianName;
	}

	/**
	 * @return the gAddressLine1
	 */
	public String getgAddressLine1() {
		return gAddressLine1;
	}

	/**
	 * @param gAddressLine1 the gAddressLine1 to set
	 */
	public void setgAddressLine1(String gAddressLine1) {
		this.gAddressLine1 = gAddressLine1;
	}

	/**
	 * @return the gAddressLine2
	 */
	public String getgAddressLine2() {
		return gAddressLine2;
	}

	/**
	 * @param gAddressLine2 the gAddressLine2 to set
	 */
	public void setgAddressLine2(String gAddressLine2) {
		this.gAddressLine2 = gAddressLine2;
	}

	/**
	 * @return the gCity
	 */
	public String getgCity() {
		return gCity;
	}

	/**
	 * @param gCity the gCity to set
	 */
	public void setgCity(String gCity) {
		this.gCity = gCity;
	}

	/**
	 * @return the gState
	 */
	public String getgState() {
		return gState;
	}

	/**
	 * @param gState the gState to set
	 */
	public void setgState(String gState) {
		this.gState = gState;
	}

	/**
	 * @return the gCountry
	 */
	public String getgCountry() {
		return gCountry;
	}

	/**
	 * @param gCountry the gCountry to set
	 */
	public void setgCountry(String gCountry) {
		this.gCountry = gCountry;
	}

	/**
	 * @return the gZipCode
	 */
	public String getgZipCode() {
		return gZipCode;
	}

	/**
	 * @param gZipCode the gZipCode to set
	 */
	public void setgZipCode(String gZipCode) {
		this.gZipCode = gZipCode;
	}

	/**
	 * @return the gContactNo1
	 */
	public String getgContactNo1() {
		return gContactNo1;
	}

	/**
	 * @param gContactNo1 the gContactNo1 to set
	 */
	public void setgContactNo1(String gContactNo1) {
		this.gContactNo1 = gContactNo1;
	}

	/**
	 * @return the gContactNo2
	 */
	public String getgContactNo2() {
		return gContactNo2;
	}

	/**
	 * @param gContactNo2 the gContactNo2 to set
	 */
	public void setgContactNo2(String gContactNo2) {
		this.gContactNo2 = gContactNo2;
	}

	/**
	 * @return the aRank
	 */
	public long getaRank() {
		return aRank;
	}

	/**
	 * @param aRank the aRank to set
	 */
	public void setaRank(long aRank) {
		this.aRank = aRank;
	}

	/**
	 * @return the a12thPercentage
	 */
	public int getA12thPercentage() {
		return a12thPercentage;
	}

	/**
	 * @param a12thPercentage the a12thPercentage to set
	 */
	public void setA12thPercentage(int a12thPercentage) {
		this.a12thPercentage = a12thPercentage;
	}

	/**
	 * @return the a10thPercentage
	 */
	public int getA10thPercentage() {
		return a10thPercentage;
	}

	/**
	 * @param a10thPercentage the a10thPercentage to set
	 */
	public void setA10thPercentage(int a10thPercentage) {
		this.a10thPercentage = a10thPercentage;
	}

	/**
	 * @return the aBranch
	 */
	public String getaBranch() {
		return aBranch;
	}

	/**
	 * @param aBranch the aBranch to set
	 */
	public void setaBranch(String aBranch) {
		this.aBranch = aBranch;
	}

	/**
	 * @return the aPassword
	 */
	public String getaPassword() {
		return aPassword;
	}

	/**
	 * @param aPassword the aPassword to set
	 */
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}	
}
