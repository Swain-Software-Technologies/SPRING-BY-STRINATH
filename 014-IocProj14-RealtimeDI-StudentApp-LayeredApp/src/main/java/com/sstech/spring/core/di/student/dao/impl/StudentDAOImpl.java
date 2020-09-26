/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.student.dao.impl;

import javax.sql.DataSource;

import com.sstech.spring.core.di.student.bo.StudentBo;
import com.sstech.spring.core.di.student.dao.StudentDAO;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
public class StudentDAOImpl implements StudentDAO {
	
	private DataSource dataSource;
	

	/**
	 * @param dataSource
	 */
	public StudentDAOImpl(DataSource dataSource) {
		System.out.println("StudentDAOImpl.StudentDAOImpl()");
		this.dataSource = dataSource;
	}


	@Override
	public Integer registerStudent(StudentBo studentBo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
