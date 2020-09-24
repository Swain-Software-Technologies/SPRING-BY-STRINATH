/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.dl.beans;

import java.util.Random;

/**
 * @author Trinath, Sep 24, 2020
 *
 * @Description : 
 */
public class Bat {

	/**
	 * 
	 * @return score 
	 */
	public int scoreRuns() {
		return new Random().nextInt(3000);
	}
}
