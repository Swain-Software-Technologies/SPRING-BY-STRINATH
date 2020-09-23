/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.dao;

import com.sstech.spring.core.di.customer.bo.CustomerEntity;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public interface CustomerDAO {

	public Integer enrollCustomer(CustomerEntity customerEntiity) throws Exception;
}
