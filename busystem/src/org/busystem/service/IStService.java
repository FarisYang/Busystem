package org.busystem.service;
import java.util.List;

import org.busystem.model.Bus;
import org.busystem.model.St;
import org.busystem.model.User;
public interface IStService {
	    public boolean addOrUpdateSt(St st);
	    public List getAllSts();
	    public St getStById(int id);
	    public boolean deleteStById(int id);
	    public List getStsByBusid(int busid);
}

