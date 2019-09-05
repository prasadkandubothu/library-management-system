package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.domain.Book;
import com.book.repository.BookRepository;
import com.book.util.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book addBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(Long bookId) {
		Optional<Book> book=bookRepo.findById(bookId);
		return book.orElseThrow(() -> new BookNotFoundException(bookId +" Requested book details not found"));
	}

	@Override
	public Long updateBook(Book book) {
		getBookById(book.getBookId());
		return bookRepo.save(book).getBookId();
	}

	@Override
	public Long deleteBook(Long bookId) {
		Book book=getBookById(bookId);
		bookRepo.delete(book);
		return bookId;
	}

}
