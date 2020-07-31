package com.ITO.BookChapter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITO.BookChapter.dto.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer>
{

}
