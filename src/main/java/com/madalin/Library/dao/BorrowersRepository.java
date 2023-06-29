package com.madalin.Library.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalin.Library.entity.Borrowers;

public interface BorrowersRepository extends JpaRepository<Borrowers, Integer> {

	Optional<Borrowers> findByLastName(String lastName);

	Optional<Borrowers> findByFirstName(String firstName);

}
