package com.trail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController
{
	@Autowired
	private Topic1Service topic1Service;
	//@RequestMapping(method=RequestMethod.GET,value="/add", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping("/add")
	public List<Topic1> getAllTopic1()
	{
		return topic1Service.getAllTopic1();
	}
}
