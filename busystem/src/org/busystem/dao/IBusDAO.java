package org.busystem.dao;
import java.util.List;

import org.busystem.model.Bus;
import org.busystem.model.User;


public interface IBusDAO {
		public List getAllBuses();
		public Bus getBusById(int id);
		public boolean deleteBusById(int id);
		public boolean addOrUpdateBus(Bus bus);
}

