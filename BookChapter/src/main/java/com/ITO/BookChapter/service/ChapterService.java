package com.ITO.BookChapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITO.BookChapter.dto.Chapters;
import com.ITO.BookChapter.repo.ChapterRepo;
@Service
public class ChapterService
{
@Autowired
private ChapterRepo chapterRepo;
public List<Chapters> showAllChapters() 
{
	return chapterRepo.findAll();
}
	public Chapters addChapter(Chapters chapter)
	{
		// TODO Auto-generated method stub
		return chapterRepo.save(chapter);
	}	
}
