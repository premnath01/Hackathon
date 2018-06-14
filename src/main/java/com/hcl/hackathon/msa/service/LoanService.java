package com.hcl.hackathon.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hackathon.msa.controller.model.Loan;
import com.hcl.hackathon.msa.dao.LoanDao;

@Service
public class LoanService {

	private final LoanDao loanDao ;

	@Autowired
	public LoanService(LoanDao loanDao){
	    this.loanDao =  loanDao ;
	}
	public Loan getLoanDetails() {
		Loan m_loan = loanDao.createMockLoan() ;
		return m_loan ;
	}
}
