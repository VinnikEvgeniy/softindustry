package com.example.bank.domain;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "WO")
public class WithdrawalOperation extends Operation {

	public WithdrawalOperation() {
		super();
	}

	public WithdrawalOperation(Date operationDate, double amount, Account account) {
		super(operationDate, amount, account);
	}

}
