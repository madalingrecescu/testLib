package com.madalin.Library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madalin.Library.dao.AuthorsRepository;
import com.madalin.Library.entity.Authors;

@Service
public class AuthorsServiceImpl implements AuthorsService{
	
	private AuthorsRepository authorsRepository;
	
	@Autowired
	public AuthorsServiceImpl(AuthorsRepository authorsRepository) {
		this.authorsRepository = authorsRepository;
	}

	@Override
	public List<Authors> findAll() {
		
		return authorsRepository.findAll();
	}

	@Override
	public void save(Authors author) {
		authorsRepository.save(author);
		
	}

	@Override
	public void deleteById(int id) {
		authorsRepository.deleteById(id);
		
	}

	@Override
	public Authors findById(int id) {
		
		Optional<Authors> result = authorsRepository.findById(id);
		
		Authors author = null;
		
		if(result.isPresent()) {
			author = result.get();
		}
		else {
			//we did not find the employee
			throw new RuntimeException("Did not find the author id - " + id);
		}
		return author;
	}

}
