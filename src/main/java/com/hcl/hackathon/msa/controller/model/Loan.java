package com.hcl.hackathon.msa.controller.model;

public class Loan {
	private String holderName;
	private String holderAddress;
	private String debitAccountHolderName ;
	private String loanType ;
	private String accountName ;
	
	public String getDebitAccountHolderName() {
		return debitAccountHolderName;
	}

	public void setDebitAccountHolderName(String debitAccountHolderName) {
		this.debitAccountHolderName = debitAccountHolderName;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getHolderAddress() {
		return holderAddress;
	}

	public void setHolderAddress(String holderAddress) {
		this.holderAddress = holderAddress;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

}
