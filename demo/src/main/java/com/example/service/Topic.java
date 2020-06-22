package com.example.service;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic
{
@Id
private String topic1;
private String topic2;
private String topic3;

public Topic(String topic1, String topic2, String topic3)
{
	super();
	this.topic1 = topic1;
	this.topic2 = topic2;
	this.topic3 = topic3;
}
public String getTopic1() {
	return topic1;
}
public void setTopic1(String topic1) {
	this.topic1 = topic1;
}
public String getTopic2() {
	return topic2;
}
public void setTopic2(String topic2) {
	this.topic2 = topic2;
}
public String getTopic3() {
	return topic3;
}
public void setTopic3(String topic3) {
	this.topic3 = topic3;
}


}
