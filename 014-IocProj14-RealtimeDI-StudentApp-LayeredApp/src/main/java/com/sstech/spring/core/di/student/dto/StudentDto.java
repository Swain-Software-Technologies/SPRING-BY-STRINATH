/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.student.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
@Data
public class StudentDto implements Serializable{

	private Integer stdId;
	private String stdName;
	private String stdAddrs;
	private Integer mark1,mark2,mark3;
}
