package com.madalin.Library.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transactionId;
	
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Books transacationBookId;
	
	@ManyToOne
	@JoinColumn(name = "borrowers_id")
	private Borrowers transactionBorrowerId;
	
	@Column(name = "check_out_date")
	private LocalDate checkOutDate;
	
	@Column(name = "return_date")
	private LocalDate returnDate;
	
	@Column(name = "overdue_fine")
	private int overdueFine;
	
}
