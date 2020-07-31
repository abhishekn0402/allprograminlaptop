package com.ITO.BookChapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITO.BookChapter.dto.Chapters;
import com.ITO.BookChapter.service.ChapterService;

@RestController
public class ChapterController
{
	@Autowired
	private ChapterService chapterService;
	@GetMapping(value="/showchapter")
	public List<Chapters> showAllChapters()
	{
		return chapterService.showAllChapters();
	}
	
	@PostMapping(value="/addchapter")
	public Chapters addChapter(@RequestBody Chapters chapters)
	{
		return chapterService.addChapter(chapters);
	}
}
