package com.jshop.entity;

// Generated 2013-11-10 22:13:34 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LogisticsbusinessareaT generated by hbm2java
 */
@Entity
@Table(name = "logisticsbusinessarea_t", catalog = "jshoper3")
public class LogisticsbusinessareaT implements java.io.Serializable {

	private String logbusareaid;
	private String logisticsid;
	private String logisticsname;
	private String costway;
	private Double normalcost;
	private Double overcost;
	private String sendarea;
	private String state;
	private Double overvalue;
	private double normalvalue;

	public LogisticsbusinessareaT() {
	}

	public LogisticsbusinessareaT(String logbusareaid, String logisticsid,
			String state, double normalvalue) {
		this.logbusareaid = logbusareaid;
		this.logisticsid = logisticsid;
		this.state = state;
		this.normalvalue = normalvalue;
	}

	public LogisticsbusinessareaT(String logbusareaid, String logisticsid,
			String logisticsname, String costway, Double normalcost,
			Double overcost, String sendarea, String state, Double overvalue,
			double normalvalue) {
		this.logbusareaid = logbusareaid;
		this.logisticsid = logisticsid;
		this.logisticsname = logisticsname;
		this.costway = costway;
		this.normalcost = normalcost;
		this.overcost = overcost;
		this.sendarea = sendarea;
		this.state = state;
		this.overvalue = overvalue;
		this.normalvalue = normalvalue;
	}

	@Id
	@Column(name = "LOGBUSAREAID", unique = true, nullable = false, length = 20)
	public String getLogbusareaid() {
		return this.logbusareaid;
	}

	public void setLogbusareaid(String logbusareaid) {
		this.logbusareaid = logbusareaid;
	}

	@Column(name = "LOGISTICSID", nullable = false, length = 20)
	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	@Column(name = "LOGISTICSNAME", length = 45)
	public String getLogisticsname() {
		return this.logisticsname;
	}

	public void setLogisticsname(String logisticsname) {
		this.logisticsname = logisticsname;
	}

	@Column(name = "COSTWAY", length = 1)
	public String getCostway() {
		return this.costway;
	}

	public void setCostway(String costway) {
		this.costway = costway;
	}

	@Column(name = "NORMALCOST", precision = 22, scale = 0)
	public Double getNormalcost() {
		return this.normalcost;
	}

	public void setNormalcost(Double normalcost) {
		this.normalcost = normalcost;
	}

	@Column(name = "OVERCOST", precision = 10)
	public Double getOvercost() {
		return this.overcost;
	}

	public void setOvercost(Double overcost) {
		this.overcost = overcost;
	}

	@Column(name = "SENDAREA", length = 5000)
	public String getSendarea() {
		return this.sendarea;
	}

	public void setSendarea(String sendarea) {
		this.sendarea = sendarea;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "OVERVALUE", precision = 22, scale = 0)
	public Double getOvervalue() {
		return this.overvalue;
	}

	public void setOvervalue(Double overvalue) {
		this.overvalue = overvalue;
	}

	@Column(name = "NORMALVALUE", nullable = false, precision = 22, scale = 0)
	public double getNormalvalue() {
		return this.normalvalue;
	}

	public void setNormalvalue(double normalvalue) {
		this.normalvalue = normalvalue;
	}

}
