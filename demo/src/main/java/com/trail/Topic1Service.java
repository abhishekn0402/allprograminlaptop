package com.trail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Topic1Service
{
	
	private List<Topic1> topic1=Arrays.asList(
			new Topic1("a","java","programing"),
			new Topic1("b","sql","RDBMS"),
			new Topic1("c","springboot","framework")
			);
	public List<Topic1> getAllTopic1()
	{
		return topic1;
	}
	/*
	 * @Autowired private Topic1Repository topic1Repository;
	 * 
	 * public List<Topic1> getAllTopic1() { List<Topic1> topic1=new ArrayList<>();
	 * topic1Repository.findAll().forEach(topic1::add); return topic1; }
	 */
}
