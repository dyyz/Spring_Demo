package com.spring.demo.xml.entity;

public class Card {

	private String cardName;
	
	private Long cardNum;

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Long getCardNum() {
		return cardNum;
	}

	public void setCardNum(Long cardNum) {
		this.cardNum = cardNum;
	}

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", cardNum=" + cardNum + "]";
	}
	
}
