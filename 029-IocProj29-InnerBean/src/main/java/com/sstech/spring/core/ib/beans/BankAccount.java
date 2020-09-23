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
public class BankAccount {

	private Long accNumber;
	private String accHolderName;
	private Float balance;
	private boolean NRIBankingEnabled;
	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(Long accNumber) {
		this.accNumber = accNumber;
	}
	/**
	 * @param accHolderName the accHolderName to set
	 */
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	/**
	 * @param nRIBankingEnabled the nRIBankingEnabled to set
	 */
	public void setNRIBankingEnabled(boolean nRIBankingEnabled) {
		NRIBankingEnabled = nRIBankingEnabled;
	}
	
	public Float showBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", balance=" + balance
				+ ", NRIBankingEnabled=" + NRIBankingEnabled + "]";
	}
	
}
