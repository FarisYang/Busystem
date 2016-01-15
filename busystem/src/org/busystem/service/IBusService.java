package org.busystem.service;
import java.util.List;

import org.busystem.model.Bus;
import org.busystem.model.User;
public interface IBusService {
	    public boolean addOrUpdateBus(Bus bus);
	    public List getAllBuses();
	    public Bus getBusById(int id);
	    public boolean deleteBusById(int id);
}

