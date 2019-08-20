package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AssistantDao;
import com.example.pojo.Assistant;

@RestController
public class ControllerClass {
	
	@Autowired
	AssistantDao assistantRepository;
	
	@GetMapping(value = "/")
	public String index(){
		return "Hello World!!";
	}
	
	@PostMapping("/add-assistant/{id}/{name}")
	public int addAssistant(@PathVariable("id") Integer id,@PathVariable("name") String name){
		int rows = assistantRepository.addAssistant(new Assistant(id, name));
		return rows;
	}
	
}
