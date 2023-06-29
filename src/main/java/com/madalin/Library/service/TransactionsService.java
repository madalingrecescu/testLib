package com.madalin.Library.service;

import com.madalin.Library.entity.Transactions;

public interface TransactionsService {

	public void save(Transactions transaction);
	
	public void deleteById(int id);
}
