package com.jshop.entity;

// Generated 2013-11-10 22:13:34 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MemberRechargeT generated by hbm2java
 */
@Entity
@Table(name = "member_recharge_t", catalog = "jshoper3")
public class MemberRechargeT implements java.io.Serializable {

	private String id;
	private String memberid;
	private String membername;
	private double balance;
	private Date createtime;
	private Date updatetime;
	private int versiont;

	public MemberRechargeT() {
	}

	public MemberRechargeT(String id, String memberid, String membername,
			double balance, Date createtime, Date updatetime, int versiont) {
		this.id = id;
		this.memberid = memberid;
		this.membername = membername;
		this.balance = balance;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.versiont = versiont;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "MEMBERID", nullable = false, length = 20)
	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Column(name = "MEMBERNAME", nullable = false, length = 100)
	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	@Column(name = "BALANCE", nullable = false, precision = 10)
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

}
