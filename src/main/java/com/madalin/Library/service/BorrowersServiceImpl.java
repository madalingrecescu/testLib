package com.madalin.Library.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madalin.Library.dao.BorrowersRepository;
import com.madalin.Library.entity.Borrowers;

@Service
public class BorrowersServiceImpl implements BorrowersService{
	
	private BorrowersRepository borrowersRepository;
	
	@Autowired
	private BorrowersServiceImpl(BorrowersRepository borrowersRepository) {
		this.borrowersRepository = borrowersRepository;
	}

	@Override
	public void save(Borrowers borrower) {
		
		borrowersRepository.save(borrower);
	}

	@Override
	public void deleteById(int id) {
		borrowersRepository.deleteById(id);
		
	}

	@Override
	public Borrowers findById(int id) {
		
		Optional<Borrowers> result = borrowersRepository.findById(id);
		
		Borrowers borrower = null;
		
		if(result.isPresent()) {
			borrower = result.get();
		}
		else {
			//we did not find the employee
			throw new RuntimeException("Did not find the borrower id - " + id);
		}
		return borrower;
	}
	

	@Override
	public Borrowers findByLastName(String lastName) {
		
		Optional<Borrowers> result = borrowersRepository.findByLastName(lastName);
		
		Borrowers borrower = null;
		
		if(result.isPresent()) {
			borrower = result.get();
		}
		else {
			//we did not find the employee
			throw new RuntimeException("Did not find the borrower last name - " + lastName);
		}
		return borrower;
	}

	@Override
	public Borrowers findByFirstName(String firstName) {
		
		Optional<Borrowers> result = borrowersRepository.findByFirstName(firstName);
		
		Borrowers borrower = null;
		
		if(result.isPresent()) {
			borrower = result.get();
		}
		else {
			//we did not find the employee
			throw new RuntimeException("Did not find the borrower first name - " + firstName);
		}
		return borrower;
	}

}
