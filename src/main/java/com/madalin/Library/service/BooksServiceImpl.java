package com.madalin.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madalin.Library.dao.BooksRepository;
import com.madalin.Library.entity.Books;

@Service
public class BooksServiceImpl implements BooksService{

	private BooksRepository booksRepository;
	
	@Autowired
	public BooksServiceImpl(BooksRepository booksRepository) {
		this.booksRepository = booksRepository;
	}
	
	@Override
	public List<Books> findAll() {
		
		return booksRepository.findAll();
	}

	@Override
	public void save(Books book) {
		booksRepository.save(book);
		
	}

	@Override
	public void deleteById(int id) {
		booksRepository.deleteById(id);
		
	}

	@Override
	public Books findById(int id) {
		Optional<Books> result = booksRepository.findById(id);
		
		Books book = null;
		
		if(result.isPresent()) {
			book = result.get();
		} else {
			throw new RuntimeException("Did not find the book with the id: " + id);
		}
		
		return book;
	}

	@Override
	public Books findByTitle(String title) {
		Optional<Books> result = booksRepository.findByTitle(title);
		
		Books book = null;
		
		if(result.isPresent()) {
			book = result.get();
		} else {
			throw new RuntimeException("Did not find the book with the title: " + title);
		}
		
		return book;
	}

}
