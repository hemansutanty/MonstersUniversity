package com.hemansu.studentregistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Muniversity")
public class Muniversity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//personal Information attributes
	//a is for applicant
	@SequenceGenerator(name="seq", initialValue=1001, allocationSize=1)
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private Integer aId;
	@Column(name="afirstname")
	private String firstNameStudent;
	@Column(name="amiddlename")
	private String middleNameStudent;
	@Column(name="alastname")
	private String lastNameStudent;
	@Column(name="adateofbirth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirthStudent;
	@Column(name="aemail")
	private String emailStudent;
	@Column(name="agender")
	private String genderStudent;
	@Column(name="anationality")
	private String nationalityStudent;
	
	//Address and contact of the applicant attributes
	@Column(name="aaddressline1")
	private String addressLine1Student;
	@Column(name="aaddressline2")
	private String addressLine2Student;
	@Column(name="acity")
	private String cityStudent;
	@Column(name="astate")
	private String stateStudent;
	@Column(name="acountry")
	private String countryStudent;
	@Column(name="azipcode")
	private String zipCodeStudent;
	@Column(name="acontactno1")
	private String contactNo1Student;
	@Column(name="acontactno2")
	private String contactNo2Student;
	
	//Guardian Information
	//g is for guardian
	@Column(name="gguardianname")
	private String guardianName;
	@Column(name="gaddressline1")
	private String addressLine1Guardian;
	@Column(name="gaddressline2")
	private String addressLine2Guardian;
	@Column(name="gcity")
	private String cityGuardian;
	@Column(name="gstate")
	private String stateGuardian;
	@Column(name="gcountry")
	private String countryGuardian;
	@Column(name="gzipcode")
	private String zipCodeGuardian;
	@Column(name="gcontactno1")
	private String contactNo1Guardian;
	@Column(name="gcontactno2")
	private String contactNo2Guardian;
	
	//Required for Admission Details
	@Column(name="arank")
	private int iitjeeRank;
	@Column(name="a12thpercentage")
	private Double percentage12th;
	@Column(name="a10thpercentage")
	private Double percentage10th;
	@Column(name="apassword")
	private String password;
	
	/**
	 * @param aId the aId to set
	 */
	public void setaId(Integer aId) {
		this.aId = aId;
	}
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
	/**
	 * @return the dateOfBirthStudent
	 */
	public Date getDateOfBirthStudent() {
		return dateOfBirthStudent;
	}
	/**
	 * @param dateOfBirthStudent the dateOfBirthStudent to set
	 */
	public void setDateOfBirthStudent(Date dateOfBirthStudent) {
		this.dateOfBirthStudent = dateOfBirthStudent;
	}
	/**
	 * @return the emailStudent
	 */
	public String getEmailStudent() {
		return emailStudent;
	}
	/**
	 * @param emailStudent the emailStudent to set
	 */
	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}
	/**
	 * @return the genderStudent
	 */
	public String getGenderStudent() {
		return genderStudent;
	}
	/**
	 * @param genderStudent the genderStudent to set
	 */
	public void setGenderStudent(String genderStudent) {
		this.genderStudent = genderStudent;
	}
	/**
	 * @return the nationalityStudent
	 */
	public String getNationalityStudent() {
		return nationalityStudent;
	}
	/**
	 * @param nationalityStudent the nationalityStudent to set
	 */
	public void setNationalityStudent(String nationalityStudent) {
		this.nationalityStudent = nationalityStudent;
	}
	/**
	 * @return the aId
	 */
	public Integer getaId() {
		return aId;
	}
	/**
	 * @param aId the aId to set
	 */
	public void setaId(int aId) {
		this.aId = aId;
	}
	/**
	 * @return the addressLine1Student
	 */
	public String getAddressLine1Student() {
		return addressLine1Student;
	}
	/**
	 * @param addressLine1Student the addressLine1Student to set
	 */
	public void setAddressLine1Student(String addressLine1Student) {
		this.addressLine1Student = addressLine1Student;
	}
	/**
	 * @return the addressLine2Student
	 */
	public String getAddressLine2Student() {
		return addressLine2Student;
	}
	/**
	 * @param addressLine2Student the addressLine2Student to set
	 */
	public void setAddressLine2Student(String addressLine2Student) {
		this.addressLine2Student = addressLine2Student;
	}
	/**
	 * @return the cityStudent
	 */
	public String getCityStudent() {
		return cityStudent;
	}
	/**
	 * @param cityStudent the cityStudent to set
	 */
	public void setCityStudent(String cityStudent) {
		this.cityStudent = cityStudent;
	}
	/**
	 * @return the stateStudent
	 */
	public String getStateStudent() {
		return stateStudent;
	}
	/**
	 * @param stateStudent the stateStudent to set
	 */
	public void setStateStudent(String stateStudent) {
		this.stateStudent = stateStudent;
	}
	/**
	 * @return the countryStudent
	 */
	public String getCountryStudent() {
		return countryStudent;
	}
	/**
	 * @param countryStudent the countryStudent to set
	 */
	public void setCountryStudent(String countryStudent) {
		this.countryStudent = countryStudent;
	}
	/**
	 * @return the zipCodeStudent
	 */
	public String getZipCodeStudent() {
		return zipCodeStudent;
	}
	/**
	 * @param zipCodeStudent the zipCodeStudent to set
	 */
	public void setZipCodeStudent(String zipCodeStudent) {
		this.zipCodeStudent = zipCodeStudent;
	}
	/**
	 * @return the contactNo1Student
	 */
	public String getContactNo1Student() {
		return contactNo1Student;
	}
	/**
	 * @param contactNo1Student the contactNo1Student to set
	 */
	public void setContactNo1Student(String contactNo1Student) {
		this.contactNo1Student = contactNo1Student;
	}
	/**
	 * @return the contactNo2Student
	 */
	public String getContactNo2Student() {
		return contactNo2Student;
	}
	/**
	 * @param contactNo2Student the contactNo2Student to set
	 */
	public void setContactNo2Student(String contactNo2Student) {
		this.contactNo2Student = contactNo2Student;
	}
	/**
	 * @return the guardianName
	 */
	public String getGuardianName() {
		return guardianName;
	}
	/**
	 * @param guardianName the guardianName to set
	 */
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	/**
	 * @return the addressLine1Guardian
	 */
	public String getAddressLine1Guardian() {
		return addressLine1Guardian;
	}
	/**
	 * @param addressLine1Guardian the addressLine1Guardian to set
	 */
	public void setAddressLine1Guardian(String addressLine1Guardian) {
		this.addressLine1Guardian = addressLine1Guardian;
	}
	/**
	 * @return the addressLine2Guardian
	 */
	public String getAddressLine2Guardian() {
		return addressLine2Guardian;
	}
	/**
	 * @param addressLine2Guardian the addressLine2Guardian to set
	 */
	public void setAddressLine2Guardian(String addressLine2Guardian) {
		this.addressLine2Guardian = addressLine2Guardian;
	}
	/**
	 * @return the cityGuardian
	 */
	public String getCityGuardian() {
		return cityGuardian;
	}
	/**
	 * @param cityGuardian the cityGuardian to set
	 */
	public void setCityGuardian(String cityGuardian) {
		this.cityGuardian = cityGuardian;
	}
	/**
	 * @return the stateGuardian
	 */
	public String getStateGuardian() {
		return stateGuardian;
	}
	/**
	 * @param stateGuardian the stateGuardian to set
	 */
	public void setStateGuardian(String stateGuardian) {
		this.stateGuardian = stateGuardian;
	}
	/**
	 * @return the countryGuardian
	 */
	public String getCountryGuardian() {
		return countryGuardian;
	}
	/**
	 * @param countryGuardian the countryGuardian to set
	 */
	public void setCountryGuardian(String countryGuardian) {
		this.countryGuardian = countryGuardian;
	}
	/**
	 * @return the zipCodeGuardian
	 */
	public String getZipCodeGuardian() {
		return zipCodeGuardian;
	}
	/**
	 * @param zipCodeGuardian the zipCodeGuardian to set
	 */
	public void setZipCodeGuardian(String zipCodeGuardian) {
		this.zipCodeGuardian = zipCodeGuardian;
	}
	/**
	 * @return the contactNo1Guardian
	 */
	public String getContactNo1Guardian() {
		return contactNo1Guardian;
	}
	/**
	 * @param contactNo1Guardian the contactNo1Guardian to set
	 */
	public void setContactNo1Guardian(String contactNo1Guardian) {
		this.contactNo1Guardian = contactNo1Guardian;
	}
	/**
	 * @return the contactNo2Guardian
	 */
	public String getContactNo2Guardian() {
		return contactNo2Guardian;
	}
	/**
	 * @param contactNo2Guardian the contactNo2Guardian to set
	 */
	public void setContactNo2Guardian(String contactNo2Guardian) {
		this.contactNo2Guardian = contactNo2Guardian;
	}
	/**
	 * @return the iitjeeRank
	 */
	public int getIitjeeRank() {
		return iitjeeRank;
	}
	/**
	 * @param iitjeeRank the iitjeeRank to set
	 */
	public void setIitjeeRank(int iitjeeRank) {
		this.iitjeeRank = iitjeeRank;
	}
	/**
	 * @return the percentage12th
	 */
	public Double getPercentage12th() {
		return percentage12th;
	}
	/**
	 * @param percentage12th the percentage12th to set
	 */
	public void setPercentage12th(Double percentage12th) {
		this.percentage12th = percentage12th;
	}
	/**
	 * @return the percentage10th
	 */
	public Double getPercentage10th() {
		return percentage10th;
	}
	/**
	 * @param percentage10th the percentage10th to set
	 */
	public void setPercentage10th(Double percentage10th) {
		this.percentage10th = percentage10th;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
