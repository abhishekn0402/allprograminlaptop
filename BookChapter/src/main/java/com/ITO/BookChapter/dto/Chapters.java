package com.ITO.BookChapter.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Chapters
{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chapterId;	
	private String chapterName;
	private String bookName;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	public Chapters()
	{
		
	}
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@JsonBackReference
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}
