/*
 * @CopyRight to Swain Software Technology Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 *
 */
package com.sstech.spring.core.ib.beans;

/**
 * @author Trinath, Sep 23, 2020
 *
 * @Description : 
 */
public class BankCustomer {

	private BankAccount bankAccount;
	private String bankName;
	
	/**
	 * @param bankAccount
	 * @param bankName
	 */
	public BankCustomer(BankAccount bankAccount, String bankName) {
		super();
		this.bankAccount = bankAccount;
		this.bankName = bankName;
	}
	
	public Float getBalance() {
		return bankAccount.showBalance();
				
	}

	@Override
	public String toString() {
		return "BankCustomer [bankAccount=" + bankAccount + ", bankName=" + bankName + "]";
	}
	
	
}
