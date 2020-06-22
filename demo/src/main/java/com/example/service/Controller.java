package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@Autowired
	private Serviceclass serviceclass;
	@RequestMapping("/topic")
	public List<Topic> getAllTopics()
	{
		return serviceclass.gettopics();
	}
	@RequestMapping("/onetopic/{topic}")
	public Optional<Topic> getonetopic(@PathVariable String topic)
	{
		return serviceclass.getonetopic(topic);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topic topic)
	{
	 serviceclass.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{topic1}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String topic1)
	{
		serviceclass.updateTopic(topic,topic1);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/{topic1}")
	public void deleteTopic(@PathVariable String topic1)
	{
		serviceclass.deleteTopic(topic1);
	}
}
