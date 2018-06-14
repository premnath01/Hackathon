package com.hcl.hackathon.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.msa.controller.model.Loan;
import com.hcl.hackathon.msa.service.LoanService;

@RestController
@RequestMapping("MSA/v1")
public class LoanController {

	private final LoanService loanService ;

	@Autowired
	public LoanController(LoanService loanService){
	    this.loanService =  loanService ;
	}
	
	@RequestMapping(value="/bins/1f340d", method=RequestMethod.GET)
	public Loan getLoanDetails() {
		Loan m_loan = loanService.getLoanDetails() ;
		return m_loan ;
	}
}
