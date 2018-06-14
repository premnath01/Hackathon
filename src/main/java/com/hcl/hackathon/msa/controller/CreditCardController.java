package com.hcl.hackathon.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.msa.controller.model.CreditCard;
import com.hcl.hackathon.msa.controller.model.Loan;
import com.hcl.hackathon.msa.service.CreditCardService;
import com.hcl.hackathon.msa.service.LoanService;

@RestController
@RequestMapping("MSA/v1")
public class CreditCardController {
	private final CreditCardService creditCardService ;

	@Autowired
	public CreditCardController(CreditCardService creditCardService){
	    this.creditCardService =  creditCardService ;
	}
	
	@RequestMapping(value="/bins/1elccl", method = RequestMethod.GET)
	public CreditCard getCreditCardDetails() {
		CreditCard m_creditCardService = creditCardService.getCreditCardDetails() ;
		return m_creditCardService ;
	}
}
