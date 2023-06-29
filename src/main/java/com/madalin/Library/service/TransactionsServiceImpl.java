package com.madalin.Library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madalin.Library.dao.TransactionsRepository;
import com.madalin.Library.entity.Transactions;


@Service
public class TransactionsServiceImpl implements TransactionsService{
	
	private TransactionsRepository transactionsRepository;
	
	@Autowired
	public TransactionsServiceImpl(TransactionsRepository transactionsRepository) {
		
		this.transactionsRepository = transactionsRepository;
	}

	@Override
	public void save(Transactions transaction) {
		transactionsRepository.save(transaction);
		
	}

	@Override
	public void deleteById(int id) {
		transactionsRepository.deleteById(id);
		
	}

}
