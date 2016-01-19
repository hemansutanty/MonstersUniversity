package com.hemansu.studentregistration.controller;

import org.hibernate.Session;

import com.hemansu.studentregistration.model.Register;
import com.hemansu.studentregistration.util.HibernateUtil;

public class RegisterDAO {
	
	public Integer saveStudent(Register registerBean){
		Integer iD = null;
		Session session = null;
		try{
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 session.save(registerBean);
			 session.getTransaction().commit();
			 iD = 101;
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
		return iD;
	}
}
