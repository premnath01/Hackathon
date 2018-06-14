package com.hcl.hackathon.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.hackathon.msa.controller.model.SavingsAccount;
import com.hcl.hackathon.msa.dao.SavingsAccountDao;

@Component
public class SavingsAccountService {
	private final SavingsAccountDao savingsAccountDao;

	@Autowired
	public SavingsAccountService(SavingsAccountDao savingsAccountDao) {
		this.savingsAccountDao = savingsAccountDao;
	}

	public SavingsAccount getSavingsAccountDetails() {
		SavingsAccount m_savingsAccount = savingsAccountDao.createMockSavingsAccount();
		return m_savingsAccount;
	}
}
