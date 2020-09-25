/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.controller;

import com.sstech.spring.core.di.customer.dto.CustomerDTO;
import com.sstech.spring.core.di.customer.service.CustomerService;
import com.sstech.spring.core.di.customer.vo.CustomerVo;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public class CustomerController {

	private CustomerService customerService;
	private CustomerDTO customerDTO;

	
	/**
	 * @param customerService
	 */
	public CustomerController(CustomerService customerService,CustomerDTO customerDTO) {
		System.out.println("CustomerController.CustomerController()");
		this.customerService = customerService;
		this.customerDTO=customerDTO;
	}


	public String processEnroll(CustomerVo customerVo) throws Exception {
//		CustomerDTO customerDTO=null;
		String result = null;
		

//		Convert VO Class Object to DTO Class Object
//		customerDTO = new CustomerDTO();//I will give permission to IOC Create Object for DTO 
		customerDTO.setCustomerId(Integer.parseInt(customerVo.getCustomerId()));
		customerDTO.setCustomerName(customerVo.getCustomerName());
		customerDTO.setCustomerAddrs(customerVo.getCustomerAddrs());
		customerDTO.setPrincipalAmt(Float.parseFloat(customerVo.getPrincipalAmt()));
		customerDTO.setRate(Float.parseFloat(customerVo.getRate()));
		customerDTO.setTime(Float.parseFloat(customerVo.getTime()));
		
//		Use Service
		result = customerService.registerCustomer(customerDTO);
		return result;
	}
}
