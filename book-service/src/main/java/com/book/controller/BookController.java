package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Book;
import com.book.service.BookService;

@CrossOrigin(origins = {"*"}, allowedHeaders = {"*"})
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks() {
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
	}
	
	@GetMapping("/{bookid}")
	public ResponseEntity<Book> getBookById(@PathVariable("bookid") Long bookId) {
		return ResponseEntity.status(HttpStatus.OK).body(bookService.getBookById(bookId));
	}
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(book));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Long> updateBook(@RequestBody Book book) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.updateBook(book));
	}
	
	
	@DeleteMapping("/{bookid}")
	public ResponseEntity<Long> deleteBookById(@PathVariable("bookid") Long bookId) {
		return ResponseEntity.status(HttpStatus.OK).body(bookService.deleteBook(bookId));
	}
}
