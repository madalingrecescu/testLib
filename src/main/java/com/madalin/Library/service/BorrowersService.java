package com.madalin.Library.service;

import com.madalin.Library.entity.Books;
import com.madalin.Library.entity.Borrowers;

public interface BorrowersService {

	
	public void save(Borrowers borrower);
	
	public void deleteById(int id);
	
	public Borrowers findById(int id);
	
	public Borrowers findByLastName(String lastName);
	
	public Borrowers findByFirstName(String firstName);

}
