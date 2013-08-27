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
 * SiteNavigationT generated by hbm2java
 */
@Entity
@Table(name = "site_navigation_t", catalog = "jshoper3")
public class SiteNavigationT implements java.io.Serializable {

	private String snid;
	private String isTargetBlank;
	private String isVisible;
	private String name;
	private String position;
	private Date createtime;
	private String creatorid;
	private String htmlPath;
	private int sort;
	private String sign;

	public SiteNavigationT() {
	}

	public SiteNavigationT(String snid, String isTargetBlank, String isVisible,
			String name, String position, Date createtime, String creatorid,
			String htmlPath, int sort, String sign) {
		this.snid = snid;
		this.isTargetBlank = isTargetBlank;
		this.isVisible = isVisible;
		this.name = name;
		this.position = position;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.htmlPath = htmlPath;
		this.sort = sort;
		this.sign = sign;
	}

	@Id
	@Column(name = "SNID", unique = true, nullable = false, length = 20)
	public String getSnid() {
		return this.snid;
	}

	public void setSnid(String snid) {
		this.snid = snid;
	}

	@Column(name = "IS_TARGET_BLANK", nullable = false, length = 1)
	public String getIsTargetBlank() {
		return this.isTargetBlank;
	}

	public void setIsTargetBlank(String isTargetBlank) {
		this.isTargetBlank = isTargetBlank;
	}

	@Column(name = "IS_VISIBLE", nullable = false, length = 1)
	public String getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "POSITION", nullable = false, length = 1)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
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

	@Column(name = "HTML_PATH", nullable = false)
	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	@Column(name = "SORT", nullable = false)
	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "SIGN", nullable = false, length = 45)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}
