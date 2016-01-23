package com.hemansu.studentregistration.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hemansu.studentregistration.model.Register;
import com.hemansu.studentregistration.model.RegisterBean;
import com.hemansu.studentregistration.util.HibernateUtil;

public class RegisterDAO {
	
	public void saveStudent(Register registerBean){
		Session session = null;
		try{
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 session.save(registerBean);
			 findNewRegisteredStudent();
			 session.getTransaction().commit();
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	public void findNewRegisteredStudent(){
		Session session = null;
		
		try{
			 RegisterBean registerBeanObj = new RegisterBean();
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 Query q = session.createSQLQuery("select * from register where aId = (select max(aId) from register)");
			 @SuppressWarnings("unchecked")
			 List<Register> resultList = q.list();
			 //Setting the values of Register entity to RegisterBean object
			 if(resultList.size()!=0){
				 registerBeanObj.setaId(resultList.get(0).getaId());
				 registerBeanObj.setFirstNameStudent((String)resultList.get(0).getFirstNameStudent());
				 registerBeanObj.setMiddleNameStudent(resultList.get(0).getMiddleNameStudent());
				 registerBeanObj.setLastNameStudent(resultList.get(0).getLastNameStudent());
				 registerBeanObj.setDateOfBirthStudent(resultList.get(0).getDateOfBirthStudent());
				 registerBeanObj.setAddressLine1Guardian(resultList.get(0).getAddressLine1Guardian());
				 registerBeanObj.setAddressLine1Student(resultList.get(0).getAddressLine1Student());
				 registerBeanObj.setAddressLine2Guardian(resultList.get(0).getAddressLine2Guardian());
				 registerBeanObj.setAddressLine2Student(resultList.get(0).getAddressLine2Student());
				 registerBeanObj.setCityGuardian(resultList.get(0).getCityGuardian());
				 registerBeanObj.setCityStudent(resultList.get(0).getCityStudent());
				 registerBeanObj.setContactNo1Guardian(resultList.get(0).getContactNo1Guardian());
				 registerBeanObj.setContactNo1Student(resultList.get(0).getContactNo1Student());
				 registerBeanObj.setContactNo2Guardian(resultList.get(0).getContactNo2Guardian());
				 registerBeanObj.setContactNo2Student(resultList.get(0).getContactNo2Student());
				 registerBeanObj.setCountryGuardian(resultList.get(0).getCountryGuardian());
				 registerBeanObj.setCountryStudent(resultList.get(0).getCountryStudent());
				 registerBeanObj.setEmailStudent(resultList.get(0).getEmailStudent());
				 registerBeanObj.setGenderStudent(resultList.get(0).getGenderStudent());
				 registerBeanObj.setGuardianName(resultList.get(0).getGuardianName());
				 registerBeanObj.setIitjeeRank(resultList.get(0).getIitjeeRank());
				 registerBeanObj.setNationalityStudent(resultList.get(0).getNationalityStudent());
				 registerBeanObj.setPassword(resultList.get(0).getPassword());
				 registerBeanObj.setPercentage10th(resultList.get(0).getPercentage10th());
				 registerBeanObj.setPercentage12th(resultList.get(0).getPercentage12th());
				 registerBeanObj.setStateGuardian(resultList.get(0).getStateGuardian());
				 registerBeanObj.setStateStudent(resultList.get(0).getStateStudent());
				 registerBeanObj.setZipCodeGuardian(resultList.get(0).getZipCodeGuardian());
			 }
			 session.getTransaction().commit();
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
