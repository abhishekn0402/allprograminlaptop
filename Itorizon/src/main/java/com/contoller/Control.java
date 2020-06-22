package com.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control
{
	@RequestMapping("/abhi")
public String abhi()
{
	return "Hi";
}
	@RequestMapping("/akki")
	public String hi()
	{
		return "hello";
	}
}
