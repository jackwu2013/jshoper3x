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
 * ActHiComment generated by hbm2java
 */
@Entity
@Table(name = "act_hi_comment", catalog = "jshoper3")
public class ActHiComment implements java.io.Serializable {

	private String id;
	private String type;
	private Date time;
	private String userId;
	private String taskId;
	private String procInstId;
	private String action;
	private String message;
	private byte[] fullMsg;

	public ActHiComment() {
	}

	public ActHiComment(String id, Date time) {
		this.id = id;
		this.time = time;
	}

	public ActHiComment(String id, String type, Date time, String userId,
			String taskId, String procInstId, String action, String message,
			byte[] fullMsg) {
		this.id = id;
		this.type = type;
		this.time = time;
		this.userId = userId;
		this.taskId = taskId;
		this.procInstId = procInstId;
		this.action = action;
		this.message = message;
		this.fullMsg = fullMsg;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TYPE_")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIME_", nullable = false, length = 0)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "USER_ID_")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "ACTION_")
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "MESSAGE_", length = 4000)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Column(name = "FULL_MSG_")
	public byte[] getFullMsg() {
		return this.fullMsg;
	}

	public void setFullMsg(byte[] fullMsg) {
		this.fullMsg = fullMsg;
	}

}
