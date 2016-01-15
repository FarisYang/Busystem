package org.busystem.service.impl;
import java.util.List;

import org.busystem.dao.IBusDAO;
import org.busystem.model.Bus;
import org.busystem.model.User;
import org.busystem.service.IBusService;


public class BusService implements IBusService{
	private IBusDAO busDAO;
	
	public IBusDAO getBusDAO() {
		return busDAO;
	}

	public void setBusDAO(IBusDAO busDAO) {
		this.busDAO = busDAO;
	}

	
	public List getAllBuses() {
		// TODO Auto-generated method stub
		return busDAO.getAllBuses();
	}
	public Bus getBusById(int id) {
		// TODO Auto-generated method stub
		return busDAO.getBusById(id);
	}
	public boolean deleteBusById(int id) {
		// TODO Auto-generated method stub
		return busDAO.deleteBusById(id);
	}
	public boolean addOrUpdateBus(Bus bus) {
		// TODO Auto-generated method stub
		return busDAO.addOrUpdateBus(bus);
	}
}

