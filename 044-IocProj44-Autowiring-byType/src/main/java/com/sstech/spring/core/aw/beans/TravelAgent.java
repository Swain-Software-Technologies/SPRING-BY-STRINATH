/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.aw.beans;

/**
 * @author Trinath, Sep 26, 2020
 *
 * @Description : 
 */
public class TravelAgent {

	private TourPlan tourPlan;
	/**
	 * 
	 */
	public TravelAgent() {
		System.out.println("TravelAgent.TravelAgent()");
	}
	
	/**
	 * @param tourPlan the tourPlan to set
	 */
	public void setTourPlan(TourPlan tourPlan) {
		this.tourPlan = tourPlan;
	}
	
	/**
	 * @return the tourPlan
	 */
	public TourPlan getTourPlan() {
		return tourPlan;
	}

	public String tourBudgeting() {
		System.out.println("TravelAgent.tourBudgeting()");
		Integer count=tourPlan.getPlaces().length;
		return tourPlan.toString()+" places having budget "+(count*5000);
	}
	
}
