/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.vo;

import lombok.Data;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
@Data
public class CustomerVo {

	private String customerId;
	private String customerName;
	private String customerAddrs;
	private String PrincipalAmt;
	private String rate;
	private String time;
}
