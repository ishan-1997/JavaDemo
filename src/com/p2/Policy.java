package com.p2;

import javax.persistence.Embeddable;

@Embeddable
public class Policy {
	public Policy(String policyName, int balance) {
		super();
		this.policyName = policyName;
		this.balance = balance;
	}
	private int poilcyNumber;
	private String policyName;
	private int balance;
	
	public int getPoilcyNumber() {
		return poilcyNumber;
	}
	public void setPoilcyNumber(int poilcyNumber) {
		this.poilcyNumber = poilcyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Policy [poilcyNumber=" + poilcyNumber + ", policyName=" + policyName + ", balance=" + balance + "]";
	}
	public Policy(int poilcyNumber, String policyName, int balance) {
		super();
		this.poilcyNumber = poilcyNumber;
		this.policyName = policyName;
		this.balance = balance;
	}
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
