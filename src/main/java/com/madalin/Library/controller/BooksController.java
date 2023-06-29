package com.madalin.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madalin.Library.entity.Books;
import com.madalin.Library.service.AuthorsService;
import com.madalin.Library.service.BooksService;

@Controller
@RequestMapping("/librarie")
public class BooksController {
	
	private BooksService booksService;
	private AuthorsService authorsService;
	
	@Autowired
	public BooksController(BooksService booksService, AuthorsService authorsService) {
		
		this.booksService = booksService;
		this.authorsService = authorsService;
	}
	
	@GetMapping("/start")
	public String startPage(Model model) {
		
		List<Books> theBooks = booksService.findAll();
		model.addAttribute("books",theBooks);
		
		return "start-page";
	}
}
