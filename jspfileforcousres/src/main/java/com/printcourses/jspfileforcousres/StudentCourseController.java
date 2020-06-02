package com.printcourses.jspfileforcousres;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentCourseController
{
	/*
	 * @RequestMapping("/akki") public String course(HttpServletRequest req) {
	 * HttpSession session=req.getSession(); String name=req.getParameter("myname");
	 * session.setAttribute("cname",name ); return "course.jsp"; }
	 */
	@RequestMapping("/akki")
	//taking request as cname and convert it into coursename
	public ModelAndView course(@RequestParam("cname") String coursename)
	{
		//create an object for model and view
		ModelAndView mv= new ModelAndView();
		//add object coursename to myname which we got from weburl
		mv.addObject("cname", coursename);
		//setting object to respective jsp file
		mv.setViewName("course.jsp");
		//return the model view object
		return mv;
	   
	}
}
