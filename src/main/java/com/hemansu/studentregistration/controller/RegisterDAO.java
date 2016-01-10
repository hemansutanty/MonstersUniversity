package com.hemansu.studentregistration.controller;

import org.hibernate.Session;

import com.hemansu.studentregistration.model.Register;
import com.hemansu.studentregistration.util.HibernateUtil;

public class RegisterDAO {
	
	public Integer saveStudent(Register registerBean){
		Integer iD = null;
		Session session = null;
		try{
			
			
			 System.out.println("Student Name:"+registerBean.getFirstNameStudent()+" "+registerBean.getMiddleNameStudent()+" "+registerBean.getLastNameStudent());
			 //System.out.println("12 Percentage:"+registerBean.getA12thPercentage());
			 //System.out.println("10 Percentage:"+registerBean.getA10thPercentage());
			 //System.out.println("Inside saveStudent of RegisterAction");
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 //System.out.println("Session Factory Created");
			 //System.out.println("Session Created");
			 session.beginTransaction();
			 //System.out.println("After Begin Transaction");
			 session.save(registerBean);
			 //System.out.println("After Save");
			 session.getTransaction().commit();
			 iD = 101;
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return iD;
	}
}
