package com.hcl.hackathon.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.hackathon.msa.controller.model.CreditCard;
import com.hcl.hackathon.msa.dao.CreditCardDao;

@Service
public class CreditCardService {
	private final CreditCardDao  creditCardDao ;

	@Autowired
	public CreditCardService(CreditCardDao creditCardDao){
	    this.creditCardDao =  creditCardDao ;
	}
	public CreditCard getCreditCardDetails() {
		CreditCard m_creditCard = creditCardDao.createMockCreditCard() ;
		return m_creditCard ;
	}
}
