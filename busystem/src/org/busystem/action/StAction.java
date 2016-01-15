package org.busystem.action;

import java.util.List;
import java.util.Map;

import org.busystem.model.St;
import org.busystem.service.IStService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StAction extends ActionSupport {
	private St st;
	private IStService stService;
	private int stid;
	private int busid;
	
	public int getBusid() {
		return busid;
	}
	public void setBusid(int busid) {
		this.busid = busid;
	}
	public St getSt() {
		return st;
	}
	public void setSt(St st) {
		this.st = st;
	}
	public IStService getStService() {
		return stService;
	}
	public void setStService(IStService stService) {
		this.stService = stService;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	
	
	

	public String browseSt() throws Exception{

		List sts=stService.getAllSts();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("sts",sts);
		return SUCCESS;
	}
	public String manageSt() throws Exception{

		List sts=stService.getAllSts();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("sts",sts);
		return SUCCESS;
	}
	public String manageOneSt()throws Exception
	{
		
		St modifySt=stService.getStById(stid);
		System.out.println("modify");
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("st",modifySt);
		return SUCCESS;
		
	}
	public String deleteOneSt()throws Exception
	{
		stService.deleteStById(stid);
		System.out.println("delete");
		return SUCCESS;
		
	}
	public String addOrUpdateStDetail()throws Exception
	{
		Map session=(Map) ActionContext.getContext().getSession();
		List list=stService.getStsByBusid(busid);
		St st1=(St)list.get(0);
		int currentStId=st1.getStid()+1;
  	    St st2=new St();
  	    st2.setStname(st.getStname());
  	    st2.setDistance(st.getDistance());
  	    st2.setStid(st.getStid());
  	    st2.setBus(st.getBus());
  	    if (stService.addOrUpdateSt(st2))

			return SUCCESS;
		else 
			return ERROR;			
		
	}
	
	public String browseStByBusid() throws Exception{

		List sts=stService.getStsByBusid(busid);
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("sts",sts);
		return SUCCESS;
	}
}
