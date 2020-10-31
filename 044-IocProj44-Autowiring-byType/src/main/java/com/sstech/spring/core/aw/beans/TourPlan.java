/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.aw.beans;

import java.util.Arrays;

/**
 * @author Trinath, Sep 26, 2020
 *
 * @Description : 
 */
public class TourPlan {

	private String[] places;

	/**
	 * @param places
	 */
	public TourPlan() {
		System.out.println("TourPlan.TourPlan(0-param constructor)");
	}

	/**
	 * @param places the places to set
	 */
	public void setPlaces(String[] places) {
		this.places = places;
	}
	

	/**
	 * @return the places
	 */
	public String[] getPlaces() {
		return places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + "]";
	}
	
}
