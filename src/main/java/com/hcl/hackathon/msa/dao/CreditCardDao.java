package com.hcl.hackathon.msa.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.hcl.hackathon.msa.controller.model.CreditCard;

@Component
public class CreditCardDao {

	public CreditCard createMockCreditCard() {
		CreditCard m_cc = new CreditCard();
		m_cc.setCardMemberName("Mr. ABCD");
		m_cc.setCardType("VISA");
		m_cc.setCreditCardNumber("1000-2000-3000");
		m_cc.setValidity(stringToDate("30-02-2020"));

		return m_cc;
	}

	private Date stringToDate(String dt) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = formatter.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
