package com.hemansu.studentregistration.controller;

import org.hibernate.Session;
import com.hemansu.studentregistration.model.Login;
import com.hemansu.studentregistration.model.Muniversity;
import com.hemansu.studentregistration.util.HibernateUtil;

public class LoginDAO {

	public Muniversity findStudent(Login loginBean)throws Exception{
		Muniversity registerObj=null;
		Session session = null;
		try{
			 session = HibernateUtil.getSessionFactory().getCurrentSession();
			 session.beginTransaction();
			 registerObj = (Muniversity)session.get(Muniversity.class, loginBean.getColgId());
			 if(registerObj==null){
				throw new Exception("Invalid Credentials");
			 }
			 if(registerObj!=null && registerObj.getPassword().trim().equals(loginBean.getPassword())==false){
				throw new Exception("Invalid Credentials");
			 }
			 session.getTransaction().commit();
		}
		catch(Exception ex){
			session.getTransaction().rollback();
			throw ex;
		}
		return registerObj;
	}
}
