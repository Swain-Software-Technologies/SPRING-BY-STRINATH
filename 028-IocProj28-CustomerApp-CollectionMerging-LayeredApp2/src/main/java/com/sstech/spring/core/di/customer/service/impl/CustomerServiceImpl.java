/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.service.impl;

import com.sstech.spring.core.di.customer.bo.CustomerEntity;
import com.sstech.spring.core.di.customer.dao.CustomerDAO;
import com.sstech.spring.core.di.customer.dto.CustomerDTO;
import com.sstech.spring.core.di.customer.service.CustomerService;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDAO customerDAO;
	
	
	/**
	 * @param customerDAO
	 */
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		System.out.println("CustomerServiceImpl.CustomerServiceImpl(1-param Constructor)");
		this.customerDAO = customerDAO;
	}


	public String registerCustomer(CustomerDTO customerDTO) throws Exception {
		System.out.println("CustomerServiceImpl.registerCustomer()");
		Float intrAmt=0.0f;
		CustomerEntity customerEntity=null;
		Integer count=null;
//		Calculate Interest Amount
		intrAmt = (customerDTO.getPrincipalAmt()*customerDTO.getRate()*customerDTO.getTime())/100.0f;
		
//		Prpare BO/Entity Class Object having Persistence Data
		customerEntity=new CustomerEntity();
		customerEntity.setCustomerId(customerDTO.getCustomerId());
		customerEntity.setCustomerName(customerDTO.getCustomerName());
		customerEntity.setCustomerAddrs(customerDTO.getCustomerAddrs());
		customerEntity.setPrincipalAmt(customerDTO.getPrincipalAmt());
		customerEntity.setIntrAmt(intrAmt);
		
//		Use DAO
		count=customerDAO.enrollCustomer(customerEntity);
//		Process the Result
		if(count==0)
			  return "Customer Registration Failed :: IntrAmt is "+intrAmt;
		else
			  return "Customer Registration Succeded :: IntrAmt is "+intrAmt;
	}

}
