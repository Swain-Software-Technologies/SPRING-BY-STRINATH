/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.service;

import com.sstech.spring.core.di.customer.dto.CustomerDTO;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public interface CustomerService {

	public String registerCustomer(CustomerDTO customerDTO) throws  Exception; 
}
