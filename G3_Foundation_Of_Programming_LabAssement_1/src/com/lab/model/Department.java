package com.lab.model;

/**
 * Department class with Department related details departmentName and it
 * extends the property from Company.
 **/

public class Department extends Company {

	private String departmentName;

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
