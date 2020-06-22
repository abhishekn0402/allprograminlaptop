package com.example.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceclass
{
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic>  gettopics()
	{
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}
	
	public Optional<Topic> getonetopic(String topic)
	{
		//return topics.stream().filter(t->t.getTopic1().equals(topic)).findFirst().get();
		return topicRepository.findById(topic);
	}
	public void addTopic(Topic topic)
	{
		//topics.add(topic);
		topicRepository.save(topic);

	}
	public void updateTopic(Topic topic, String topic1)
	{
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t=topics.get(i);
		 * if(t.getTopic1().equals(topic1)) { topics.set(i,topic); return; } }
		 */
		topicRepository.save(topic);
	}
	public void deleteTopic(String topic1)
	{
		//topics.removeIf(t->t.getTopic1().equals(topic1));
		topicRepository.deleteById(topic1);
	}
}
