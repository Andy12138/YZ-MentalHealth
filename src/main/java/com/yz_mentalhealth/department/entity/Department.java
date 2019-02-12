package com.yz_mentalhealth.department.entity;

import java.util.Date;

public class Department {

	private String id;
	private String departmentName;
	private String xgr;
	private Date xgsj;
	private String cjr;
	private Date cjsj;

	public Department() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}

	public Date getXgsj() {
		return xgsj;
	}

	public void setXgsj(Date xgsj) {
		this.xgsj = xgsj;
	}

	public String getCjr() {
		return cjr;
	}

	public void setCjr(String cjr) {
		this.cjr = cjr;
	}

	public Date getCjsj() {
		return cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	@Override
	public String toString() {
		return "Department{" +
				"id='" + id + '\'' +
				", departmentName='" + departmentName + '\'' +
				", xgr='" + xgr + '\'' +
				", xgsj=" + xgsj +
				", cjr='" + cjr + '\'' +
				", cjsj=" + cjsj +
				'}';
	}
}
