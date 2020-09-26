/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.di.student.dao;

import com.sstech.spring.core.di.student.bo.StudentBo;

/**
 * @author Trinath, Sep 25, 2020
 *
 * @Description : 
 */
public interface StudentDAO {

	public Integer registerStudent(StudentBo studentBo)throws Exception;
}
