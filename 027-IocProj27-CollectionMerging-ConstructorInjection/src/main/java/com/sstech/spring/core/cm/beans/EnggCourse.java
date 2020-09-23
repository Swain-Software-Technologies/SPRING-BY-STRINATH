/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.cm.beans;

import java.util.List;

/**
 * @author Trinath, Sep 23, 2020
 *
 * @Description : 
 */
public class EnggCourse {

	private List<String> subjects;
	
	/**
	 * @param subjects
	 */
	public EnggCourse(List<String> subjects) {
		System.out.println("EnggCourse.EnggCourse()");
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
	
	
}
