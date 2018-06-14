package com.hcl.hackathon.msa.controller.model;

import java.util.Date;

public class CreditCard {
	private String creditCardNumber;
	private String cardMemberName;
	private String cardType;
	private Date validity;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCardMemberName() {
		return cardMemberName;
	}

	public void setCardMemberName(String cardMemberName) {
		this.cardMemberName = cardMemberName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getValidity() {
		return validity;
	}

	public void setValidity(Date validity) {
		this.validity = validity;
	}

}
