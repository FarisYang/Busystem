package org.busystem.service.impl;
import java.util.List;

import org.busystem.dao.IBusDAO;
import org.busystem.dao.IStDAO;
import org.busystem.model.Bus;
import org.busystem.model.St;
import org.busystem.model.User;
import org.busystem.service.IBusService;
import org.busystem.service.IStService;


public class StService implements IStService{
	private IStDAO stDAO;
	
	public IStDAO getStDAO() {
		return stDAO;
	}

	public void setStDAO(IStDAO stDAO) {
		this.stDAO = stDAO;
	}

	
	public List getAllSts() {
		// TODO Auto-generated method stub
		return stDAO.getAllSts();
	}
	public St getStById(int id) {
		// TODO Auto-generated method stub
		return stDAO.getStById(id);
	}
	public boolean deleteStById(int id) {
		// TODO Auto-generated method stub
		return stDAO.deleteStById(id);
	}
	public boolean addOrUpdateSt(St st) {
		// TODO Auto-generated method stub
		return stDAO.addOrUpdateSt(st);
	}
	public List getStsByBusid(int busid)
	{
		return stDAO.getStsByBusid(busid);
	}
}

