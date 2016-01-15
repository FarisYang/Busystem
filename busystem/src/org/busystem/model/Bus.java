package org.busystem.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Bus entity. @author MyEclipse Persistence Tools
 */

public class Bus implements java.io.Serializable {

	// Fields

	private Integer busid;
	private String busname;
	private String time;
	private Set sts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bus() {
	}

	/** full constructor */
	public Bus(String busname, String time, Set sts) {
		this.busname = busname;
		this.time = time;
		this.sts = sts;
	}

	// Property accessors

	public Integer getBusid() {
		return this.busid;
	}

	public void setBusid(Integer busid) {
		this.busid = busid;
	}

	public String getBusname() {
		return this.busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Set getSts() {
		return this.sts;
	}

	public void setSts(Set sts) {
		this.sts = sts;
	}

}