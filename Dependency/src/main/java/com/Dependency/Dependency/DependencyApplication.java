package com.Dependency.Dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=SpringApplication.run(DependencyApplication.class, args);
		Company company=context.getBean(Company.class);
		company.com();
	}

}
