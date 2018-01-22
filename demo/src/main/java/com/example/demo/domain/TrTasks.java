package com.example.demo.domain;

import java.io.Serializable;

public class TrTasks implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ftaskid;
	private String ftasksign;
	private String ftaskname;
	private Integer fissystask;
	private Integer ftaskclassid;
	private Integer fusemodule;
	private String fsource;
	private String vpd_compid;
	private String dccode;
	private String fregdeptid;
	private Integer fusemoneytype;

	public Integer getFtaskid() {
		return ftaskid;
	}

	public void setFtaskid(Integer ftaskid) {
		this.ftaskid = ftaskid;
	}

	public String getFtasksign() {
		return ftasksign;
	}

	public void setFtasksign(String ftasksign) {
		this.ftasksign = ftasksign;
	}

	public String getFtaskname() {
		return ftaskname;
	}

	public void setFtaskname(String ftaskname) {
		this.ftaskname = ftaskname;
	}

	public Integer getFissystask() {
		return fissystask;
	}

	public void setFissystask(Integer fissystask) {
		this.fissystask = fissystask;
	}

	public Integer getFtaskclassid() {
		return ftaskclassid;
	}

	public void setFtaskclassid(Integer ftaskclassid) {
		this.ftaskclassid = ftaskclassid;
	}

	public Integer getFusemodule() {
		return fusemodule;
	}

	public void setFusemodule(Integer fusemodule) {
		this.fusemodule = fusemodule;
	}

	public String getFsource() {
		return fsource;
	}

	public void setFsource(String fsource) {
		this.fsource = fsource;
	}

	public String getVpd_compid() {
		return vpd_compid;
	}

	public void setVpd_compid(String vpd_compid) {
		this.vpd_compid = vpd_compid;
	}

	public String getDccode() {
		return dccode;
	}

	public void setDccode(String dccode) {
		this.dccode = dccode;
	}

	public String getFregdeptid() {
		return fregdeptid;
	}

	public void setFregdeptid(String fregdeptid) {
		this.fregdeptid = fregdeptid;
	}

	public Integer getFusemoneytype() {
		return fusemoneytype;
	}

	public void setFusemoneytype(Integer fusemoneytype) {
		this.fusemoneytype = fusemoneytype;
	}
}
