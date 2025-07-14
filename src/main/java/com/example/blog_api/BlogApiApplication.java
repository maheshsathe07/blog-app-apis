package com.example.blog_api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApiApplication.class, args);
	}

	@Bean // using this SpringContainer creates its object automatically and provide use anywhere at time of Autowiring
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}
