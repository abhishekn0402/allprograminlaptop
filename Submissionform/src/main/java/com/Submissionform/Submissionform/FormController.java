package com.Submissionform.Submissionform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController
{
	@RequestMapping("/a")
public String edureka()
{
	return "edureka.jsp";
}
}
