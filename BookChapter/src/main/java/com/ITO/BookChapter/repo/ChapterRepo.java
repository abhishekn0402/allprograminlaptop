package com.ITO.BookChapter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITO.BookChapter.dto.Chapters;
@Repository
public interface ChapterRepo extends JpaRepository<Chapters, Integer> 
{

}
