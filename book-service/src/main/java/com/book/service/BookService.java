package com.book.service;

import java.util.List;

import com.book.domain.Book;

public interface BookService {

	public Book addBook(Book book);
	public List<Book> getAllBooks();
	public Book getBookById(Long bookId);
	public Long updateBook(Book book);
	public Long deleteBook(Long bookId);
	
}
