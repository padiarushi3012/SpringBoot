package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name="Assistants")
public class Assistant {

	//@Id
	private int ast_id;
	private String name;
	
	public Assistant(int ast_id, String name) {
		super();
		this.ast_id = ast_id;
		this.name = name;
	}
	public int getAst_id() {
		return ast_id;
	}
	public void setAst_id(int ast_id) {
		this.ast_id = ast_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
