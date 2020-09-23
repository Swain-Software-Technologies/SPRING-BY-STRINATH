/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.bi.beans;

/**
 * @author Trinath, Sep 22, 2020
 *
 * @Description : 
 */
public class Bike {

	private String regdNo;
	private String owner;
	private String model;
	private String company;
	private String color;
	private Integer engineCC;
	private Integer fuelTankCapacity;
	private Long engineNo;
	
	/**
	 * @param regdNo
	 * @param owner
	 * @param model
	 * @param company
	 * @param color
	 * @param engineCC
	 * @param fuelTankCapacity
	 * @param engineNo
	 */
	public Bike(String regdNo, String owner, String model, String company, String color, Integer engineCC,
			Integer fuelTankCapacity, Long engineNo) {
		super();
		this.regdNo = regdNo;
		this.owner = owner;
		this.model = model;
		this.company = company;
		this.color = color;
		this.engineCC = engineCC;
		this.fuelTankCapacity = fuelTankCapacity;
		this.engineNo = engineNo;
	}

	@Override
	public String toString() {
		return "Bike [regdNo=" + regdNo + ", owner=" + owner + ", model=" + model + ", company=" + company + ", color="
				+ color + ", engineCC=" + engineCC + ", fuelTankCapacity=" + fuelTankCapacity + ", engineNo=" + engineNo
				+ "]";
	}
	
	
}
