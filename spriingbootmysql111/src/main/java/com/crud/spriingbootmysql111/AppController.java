package com.crud.spriingbootmysql111;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController
{
	@Autowired
	private ProductService service;
	@RequestMapping("/")
	public String viewHomepage(Model model)
	{
		List<Product>listproducts=service.listAll();
		model.addAttribute("listproducts", listproducts);
		return "index";
	}
		public String shownewProductform(Model model)
		{
			Product product=new Product();
			model.addAttribute("product", product);
			return "new_product";
		}
}
