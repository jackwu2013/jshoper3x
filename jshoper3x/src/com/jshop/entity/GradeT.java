package com.jshop.entity;

// Generated 2013-8-27 20:25:25 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GradeT generated by hbm2java
 */
@Entity
@Table(name = "grade_t", catalog = "jshoper3")
public class GradeT implements java.io.Serializable {

	private String gradeid;
	private String gradevalue;
	private String gradename;
	private double needcost;
	private double discount;
	private Date createtime;
	private String creatorid;

	public GradeT() {
	}

	public GradeT(String gradeid, String gradename, double needcost,
			double discount, Date createtime, String creatorid) {
		this.gradeid = gradeid;
		this.gradename = gradename;
		this.needcost = needcost;
		this.discount = discount;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public GradeT(String gradeid, String gradevalue, String gradename,
			double needcost, double discount, Date createtime, String creatorid) {
		this.gradeid = gradeid;
		this.gradevalue = gradevalue;
		this.gradename = gradename;
		this.needcost = needcost;
		this.discount = discount;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	@Id
	@Column(name = "GRADEID", unique = true, nullable = false, length = 20)
	public String getGradeid() {
		return this.gradeid;
	}

	public void setGradeid(String gradeid) {
		this.gradeid = gradeid;
	}

	@Column(name = "GRADEVALUE", length = 1)
	public String getGradevalue() {
		return this.gradevalue;
	}

	public void setGradevalue(String gradevalue) {
		this.gradevalue = gradevalue;
	}

	@Column(name = "GRADENAME", nullable = false, length = 45)
	public String getGradename() {
		return this.gradename;
	}

	public void setGradename(String gradename) {
		this.gradename = gradename;
	}

	@Column(name = "NEEDCOST", nullable = false, precision = 10)
	public double getNeedcost() {
		return this.needcost;
	}

	public void setNeedcost(double needcost) {
		this.needcost = needcost;
	}

	@Column(name = "DISCOUNT", nullable = false, precision = 10)
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

}
