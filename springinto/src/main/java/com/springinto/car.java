package com.springinto;

public class car implements vehicle{

	
	private int id;
	private String name;
	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void drive() {
		
		System.out.println("Im Going in Car");
		
	}
	
}