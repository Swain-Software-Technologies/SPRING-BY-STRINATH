/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.bo;

import lombok.Data;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
@Data
public class CustomerEntity {

	private Integer customerId;
	private String customerName;
	private String customerAddrs;
	private Float PrincipalAmt;
	private Float IntrAmt;
	
}
