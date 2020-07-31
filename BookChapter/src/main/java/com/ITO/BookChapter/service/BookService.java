package com.ITO.BookChapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITO.BookChapter.dto.Book;
import com.ITO.BookChapter.repo.BookRepo;

@Service
public class BookService 
{
	@Autowired
private BookRepo bookRepo;
	public List<Book> showAllBooks() {
		return bookRepo.findAll();
		
	}
	public Book addBook(Book book)
	{
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	
}
