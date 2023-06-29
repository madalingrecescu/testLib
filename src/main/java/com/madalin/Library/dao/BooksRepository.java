package com.madalin.Library.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalin.Library.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	Optional<Books> findByTitle(String title);

}
