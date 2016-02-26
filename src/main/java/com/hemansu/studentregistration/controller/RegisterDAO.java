package com.hemansu.studentregistration.controller;

import org.hibernate.Session;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.util.HibernateUtil;

public class RegisterDAO {
	
	public void saveStudent(Muniversity registerBean){
		Session session = null;
		try{
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 session.save(registerBean);
			 session.getTransaction().commit();
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
