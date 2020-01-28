package com.example.bank.domain;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CA")
public class CurrentAccount extends Account {


	private double overdraft;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountId, Date creationDate, double discount, Customer customer, double overdraft) {
		super(accountId, creationDate, discount, customer);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

}
