package org.busystem.dao.impl;
import java.util.List;

import org.busystem.dao.IBusDAO;
import org.busystem.model.Bus;
import org.busystem.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BusDAO  implements IBusDAO{
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	
	public List getAllBuses() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Bus order by busid desc");
		List buses=query.list();
		session.flush();
		session.clear();
		ts.commit();
		session.close();
		return buses;
	}
	public Bus getBusById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Bus where busid="+id);
		List buses=query.list();
		
		session.close();
		
		return (Bus) buses.get(0);
	}
	
	public boolean deleteBusById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		 Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Bus where busid="+id);
		List buses=query.list();
		session.delete((Bus) buses.get(0));
		ts.commit();
		session.close();
		return true;
	}
	
	public boolean addOrUpdateBus(Bus bus) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.saveOrUpdate(bus);
		ts.commit();
		session.close();
		return true;
	}
	
}

