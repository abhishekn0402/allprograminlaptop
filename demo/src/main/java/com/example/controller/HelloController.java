package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController 
{
	@RequestMapping("/abhi")
	public String hello1()
	{
		return "hi";
	}
	@RequestMapping("/akki")
	public String hello2()
	{
		return "helo";
	}
}
