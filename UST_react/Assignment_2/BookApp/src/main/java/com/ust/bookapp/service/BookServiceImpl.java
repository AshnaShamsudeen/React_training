package com.ust.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.bookapp.model.Book;
import com.ust.bookapp.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepo repo;


	public Book getBookById(int id) {
		return repo.findById(id).get();
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}

	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	public void deleteBookById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
