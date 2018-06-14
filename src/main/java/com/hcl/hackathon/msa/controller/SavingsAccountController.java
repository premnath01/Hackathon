package com.hcl.hackathon.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathon.msa.controller.model.SavingsAccount;
import com.hcl.hackathon.msa.service.CreditCardService;
import com.hcl.hackathon.msa.service.SavingsAccountService;

@RestController
@RequestMapping("MSA/v1")
public class SavingsAccountController {
	private final SavingsAccountService savingsAccountService ;
	
	@Autowired
	public SavingsAccountController(SavingsAccountService savingsAccountService){
	    this.savingsAccountService =  savingsAccountService ;
	}
	
	@RequestMapping(value="/bins/vnrhn", method = RequestMethod.GET)
	public SavingsAccount getSavingsAccountDetails() {
		SavingsAccount m_savingsAccountService = savingsAccountService.getSavingsAccountDetails() ;
		return m_savingsAccountService ;
	}
}
