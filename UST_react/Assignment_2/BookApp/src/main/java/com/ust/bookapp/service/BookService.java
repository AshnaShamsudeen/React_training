package com.ust.bookapp.service;

import java.util.List;

import com.ust.bookapp.model.Book;


public interface BookService {
	public Book getBookById(int id);
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public Book updateBook(Book book);
	public void deleteBookById(int id);
	
	

}
