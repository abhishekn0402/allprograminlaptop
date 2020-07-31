package com.ITO.BookChapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITO.BookChapter.dto.Book;
import com.ITO.BookChapter.service.BookService;

@RestController
public class BookController
{
	@Autowired
	private BookService bookService;
	@GetMapping(value="/showbook")
	public List<Book> showAllBooks()
	{
		return bookService.showAllBooks();
	}
	@PostMapping(value="/addbook")
	public Book addBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
}
