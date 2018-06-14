package com.hcl.hackathon.msa.dao;

import org.springframework.stereotype.Component;

import com.hcl.hackathon.msa.controller.model.Loan;

@Component
public class LoanDao {

	public Loan createMockLoan() {
		Loan m_loan = new Loan() ;
		m_loan.setAccountName("AA123456") ;
		m_loan.setDebitAccountHolderName("Mrs. ABCD") ;
		m_loan.setHolderAddress("Bangalore") ;
		m_loan.setHolderName("Mr. ABCD") ;
		m_loan.setLoanType("Home Loan") ;
		
		return m_loan ;
	}
}
