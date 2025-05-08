package com.ecommerce.ProductServiceMay25.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
public class SampleController
{
	// Sample endpoint
	@RequestMapping("/hello/{name}/{numberOfTimes}")
	public String hello(@PathVariable String name, @PathVariable int numberOfTimes)
	{
		StringBuilder response = new StringBuilder();
		for (int i = 0; i < numberOfTimes; i++)
		{
			response.append("Hello ").append(name).append("!!!! ").append("<br>");
		}
		return response.toString();
	}

	// Add more endpoints as needed

}
