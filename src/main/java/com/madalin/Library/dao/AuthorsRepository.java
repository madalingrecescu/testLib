package com.madalin.Library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalin.Library.entity.Authors;

public interface AuthorsRepository extends JpaRepository<Authors, Integer> {

}
