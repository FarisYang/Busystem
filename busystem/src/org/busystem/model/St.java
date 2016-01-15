package org.busystem.model;

/**
 * St entity. @author MyEclipse Persistence Tools
 */

public class St implements java.io.Serializable {

	// Fields

	private Integer stid;
	private Bus bus;
	private String stname;
	private Double distance;

	// Constructors

	/** default constructor */
	public St() {
	}

	/** full constructor */
	public St(Bus bus, String stname, Double distance) {
		this.bus = bus;
		this.stname = stname;
		this.distance = distance;
	}

	// Property accessors

	public Integer getStid() {
		return this.stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public Bus getBus() {
		return this.bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public String getStname() {
		return this.stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

}