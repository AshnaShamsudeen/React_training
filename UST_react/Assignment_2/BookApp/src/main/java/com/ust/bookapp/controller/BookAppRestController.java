package com.ust.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bookapp.model.Book;
import com.ust.bookapp.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookAppRestController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable int id) {
		return service.getBookById(id);
	}
	@GetMapping
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
	
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@PutMapping("/{id}")
	public Book updateBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBookById(@PathVariable int id) {
		service.deleteBookById(id);
	}

}
