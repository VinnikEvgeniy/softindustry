package com.example.bank.domain;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class PaymentOperation extends Operation {

	public PaymentOperation() {
		super();
	}

	public PaymentOperation(Date operationDate, double amount, Account account) {
		super(operationDate, amount, account);
	}

}
