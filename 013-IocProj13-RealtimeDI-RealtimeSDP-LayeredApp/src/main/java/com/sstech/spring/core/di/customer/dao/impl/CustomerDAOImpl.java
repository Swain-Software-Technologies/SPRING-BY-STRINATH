/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.customer.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Set;

import javax.sql.DataSource;

import com.sstech.spring.core.di.customer.bo.CustomerEntity;
import com.sstech.spring.core.di.customer.dao.CustomerDAO;

/**
 * @author Trinath, Sep 21, 2020
 *
 * @Description : 
 */
public class CustomerDAOImpl implements CustomerDAO {
	
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMER VALUES(?,?,?,?,?)";
	private DataSource dataSource ;
	
	

	/**
	 * @param dataSource
	 */
	public CustomerDAOImpl(DataSource dataSource) {
		System.out.println("CustomerDAOImpl.CustomerDAOImpl(1-Param Constructor)");
		this.dataSource = dataSource;
	}



	public Integer enrollCustomer(CustomerEntity customerEntiity) throws Exception {
		Connection con=null;
		PreparedStatement preparedStatement=null;
		Integer count=null;
//		Get the JDBC Connection Object From JDBC Connection Pool
		con=dataSource.getConnection();
//		Create JDBC PreparedStatement Object Having SQL QUERY
		preparedStatement=con.prepareStatement(INSERT_CUSTOMER_QUERY);
//		Set Values to Query Params
		preparedStatement.setInt(1, customerEntiity.getCustomerId());
		preparedStatement.setString(2, customerEntiity.getCustomerName());
		preparedStatement.setString(3, customerEntiity.getCustomerAddrs());
		preparedStatement.setFloat(4, customerEntiity.getPrincipalAmt());
		preparedStatement.setFloat(5, customerEntiity.getIntrAmt());
//		Execute Query
		count=preparedStatement.executeUpdate();
//		Close JDBC Object
		preparedStatement.close();
		con.close();
		return count;
	}

}
