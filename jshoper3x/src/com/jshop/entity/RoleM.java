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
 * RoleM generated by hbm2java
 */
@Entity
@Table(name = "role_m", catalog = "jshoper3")
public class RoleM implements java.io.Serializable {

	private String id;
	private String rolename;
	private String note;
	private Date createtime;

	public RoleM() {
	}

	public RoleM(String id, String rolename, Date createtime) {
		this.id = id;
		this.rolename = rolename;
		this.createtime = createtime;
	}

	public RoleM(String id, String rolename, String note, Date createtime) {
		this.id = id;
		this.rolename = rolename;
		this.note = note;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "ROLENAME", nullable = false, length = 45)
	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Column(name = "NOTE", length = 500)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
