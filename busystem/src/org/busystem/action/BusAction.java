package org.busystem.action;

import java.util.List;
import java.util.Map;

import org.busystem.model.Bus;
import org.busystem.service.IBusService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BusAction extends ActionSupport {
	private Bus bus;
	private IBusService busService;
	private int busid;
	
	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public IBusService getBusService() {
		return busService;
	}

	public void setBusService(IBusService busService) {
		this.busService = busService;
	}

	public String browseBus() throws Exception{

		List buses=busService.getAllBuses();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("buses",buses);
		return SUCCESS;
	}
	public String manageBus() throws Exception{

		List buses=busService.getAllBuses();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("buses",buses);
		return SUCCESS;
	}
	public String manageOneBus()throws Exception
	{
		
		Bus modifyBus=busService.getBusById(busid);
		System.out.println("modify");
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("bus",modifyBus);
		return SUCCESS;
		
	}
	public String deleteOneBus()throws Exception
	{
		busService.deleteBusById(busid);
		System.out.println("delete");
		return SUCCESS;
		
	}
	public String addOrUpdateBusDetail()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		List list=busService.getAllBuses();
		Bus bus1=(Bus)list.get(0);
		int currentBusId=bus1.getBusid()+1;
  	    Bus bus2=new Bus();
  	    bus2.setBusname(bus.getBusname());
  	    bus2.setTime(bus.getTime());
  	    bus2.setBusid(bus.getBusid());
  	    if (busService.addOrUpdateBus(bus2))

			return SUCCESS;
		else 
			return ERROR;			
		
	}
	
}
