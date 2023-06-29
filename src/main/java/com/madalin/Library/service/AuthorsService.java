package com.madalin.Library.service;

import java.util.List;

import com.madalin.Library.entity.Authors;

public interface AuthorsService {

		public List<Authors> findAll();
		
		public void save(Authors author);
		
		public void deleteById(int id);
		
		public Authors findById(int id);
}
