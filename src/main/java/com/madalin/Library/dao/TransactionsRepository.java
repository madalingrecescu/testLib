package com.madalin.Library.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madalin.Library.entity.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

}
