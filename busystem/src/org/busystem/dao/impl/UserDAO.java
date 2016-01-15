package org.busystem.dao.impl;
import java.util.List;
import org.busystem.dao.IUserDAO;
import org.busystem.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO  implements IUserDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean addOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.saveOrUpdate(user);
		ts.commit();
		session.close();
		return true;
	}
	
	public User checkUser(User user) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where username='"+user.getUsername()+"' and password='"+user.getPassword()+"' and role='"+user.getRole()+"'");
		//Query query=session.createQuery("from User where username='ty' and password='666' and role='customer'");
	    		User user1=new User();
		List list=query.list();
		ts.commit();
		session.close();
        if(list.size()!=0)
        	{user1=(User) list.get(0);
		return user1;}
        return null;
	}
	
	public List getAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where role='customer' order by userid desc");
		List users=query.list();
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return users;
	}
	
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where userid="+id);
		List users=query.list();
		
		session.close();
		
		return (User) users.get(0);
	}
	
	public boolean deleteUserById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from User where userid="+id);
		List users=query.list();
		session.delete((User) users.get(0));
		ts.commit();
		session.close();
		return true;
	}
}

