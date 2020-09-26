/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.student.bo;

import lombok.Data;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
@Data
public class StudentBo {

	private Integer stdId;
	private String stdName;
	private String stdAddrs;
	private Integer totalMark;
	private Float avgMark;
	private String result;
}
