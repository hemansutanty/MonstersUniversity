package com.hemansu.studentregistration.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.util.HibernateUtil;

public class RegisterDAO {
	
	public Integer saveStudent(Muniversity registerBean){
		Session session = null;
		Integer newId = null;
		try{
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 session.save(registerBean);
			 session.getTransaction().commit();
			 newId = findMaxID();
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
		return newId;
	}
	public int findMaxID(){
		Session session = null;
		Integer iD = null;
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			Query q = session.createSQLQuery("select max(aid) from Muniversity");
			@SuppressWarnings("unchecked")
			List<Object> list = q.list();
			iD = (Integer)list.get(0);
			//System.out.println(iD);
			session.getTransaction().commit();
		}
		catch(Exception ex){
			ex.printStackTrace();
			session.getTransaction().rollback();
		}
		return iD;
	}
}
