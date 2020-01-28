package com.example.bank.service;

import org.springframework.data.domain.Page;

import com.example.bank.domain.Account;
import com.example.bank.domain.Operation;

public interface IBankService {
	public Account getAccountById(String accountId);
	public void payToAccount(String accountId, double amount);
	public void removeFromAccount(String accountId, double amount);
	public void transfer(String accountOriginId, String accountDestId, double amount);
	public Page<Operation> getAccountOperationByPage(String accountId, int page, int size);

}
