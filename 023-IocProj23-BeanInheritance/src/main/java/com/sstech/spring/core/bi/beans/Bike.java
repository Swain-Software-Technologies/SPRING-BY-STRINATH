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
	 * @param regdNo the regdNo to set
	 */
	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @param engineCC the engineCC to set
	 */
	public void setEngineCC(Integer engineCC) {
		this.engineCC = engineCC;
	}
	/**
	 * @param fuelTankCapacity the fuelTankCapacity to set
	 */
	public void setFuelTankCapacity(Integer fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	/**
	 * @param engineNo the engineNo to set
	 */
	public void setEngineNo(Long engineNo) {
		this.engineNo = engineNo;
	}
	@Override
	public String toString() {
		return "Bike [regdNo=" + regdNo + ", owner=" + owner + ", model=" + model + ", company=" + company + ", color="
				+ color + ", engineCC=" + engineCC + ", fuelTankCapacity=" + fuelTankCapacity + ", engineNo=" + engineNo
				+ "]";
	}
	
	
}
