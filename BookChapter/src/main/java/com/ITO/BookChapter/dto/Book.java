package com.ITO.BookChapter.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	private String bookType;
	private String writter;
	//@OneToMany(targetEntity = Chapters.class,cascade = CascadeType.ALL)
	//@JoinColumn(name="book_fr",referencedColumnName = "bookId")
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "book",fetch = FetchType.LAZY)
	//@JsonManagedReference
    private List<Chapters> chapters;
	public Book()
	{
		
	}

	public List<Chapters> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapters> chapters) {
		this.chapters = chapters;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getWritter() {
		return writter;
	}
	public void setWritter(String writter) {
		this.writter = writter;
	}
	
}
