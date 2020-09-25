/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.ni.beans;

import java.util.Date;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description :
 */
public class PersonalInfo {

	private Long aadharId;
	private String name;
	private Date doBirth;
	private Date doJoining;
	/**
	 * 
	 */
	public PersonalInfo() {
		System.out.println("PersonalInfo.PersonalInfo(0-param Constructor)");
	}
	/**
	 * @param aadharId
	 * @param name
	 * @param doBirth
	 * @param doJoining
	 */
	public PersonalInfo(Long aadharId, String name, Date doBirth, Date doJoining) {
		System.out.println("PersonalInfo.PersonalInfo()");
		this.aadharId = aadharId;
		this.name = name;
		this.doBirth = doBirth;
		this.doJoining = doJoining;
	}
	@Override
	public String toString() {
		return "PersonalInfo [aadharId=" + aadharId + ", name=" + name + ", doBirth=" + doBirth + ", doJoining="
				+ doJoining + "]";
	}
	
	
}
