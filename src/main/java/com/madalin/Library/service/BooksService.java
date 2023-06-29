package com.madalin.Library.service;

import java.util.List;

import com.madalin.Library.entity.Books;

public interface BooksService {

	public List<Books> findAll();
	
	public void save(Books book);
	
	public void deleteById(int id);
	
	public Books findById(int id);
	
	public Books findByTitle(String title);
}
