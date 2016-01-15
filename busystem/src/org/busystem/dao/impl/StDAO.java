package org.busystem.dao.impl;
import java.util.List;

import org.busystem.dao.IBusDAO;
import org.busystem.dao.IStDAO;
import org.busystem.model.Bus;
import org.busystem.model.St;
import org.busystem.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StDAO  implements IStDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
	public List getAllSts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from St order by stid desc");
		List sts=query.list();
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return sts;
	}
	public St getStById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from St where stid="+id);
		List sts=query.list();
		
		session.close();
		
		return (St) sts.get(0);
	}
	
	public boolean deleteStById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from St where stid="+id);
		List sts=query.list();
		session.delete((St) sts.get(0));
		ts.commit();
		session.close();
		return true;
	}
	
	public boolean addOrUpdateSt(St st) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.saveOrUpdate(st);
		ts.commit();
		session.close();
		return true;
	}
	
	public List getStsByBusid(int busid)
	{
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from St where busid="+busid);
		List sts=query.list();
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return sts;
	}
}

