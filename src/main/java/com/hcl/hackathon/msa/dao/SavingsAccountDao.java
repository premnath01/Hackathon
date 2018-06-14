package com.hcl.hackathon.msa.dao;

import org.springframework.stereotype.Component;

import com.hcl.hackathon.msa.controller.model.SavingsAccount;

@Component
public class SavingsAccountDao {
	
	public SavingsAccount createMockSavingsAccount() {
		SavingsAccount m_sav = new SavingsAccount() ;
		m_sav.setAccountHolderName("Mr. ABCD") ;
		m_sav.setAccHolderAddress("Bangalore") ;
		m_sav.setAccountType("Savings") ;
		
		return m_sav;
	}
}
