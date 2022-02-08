package com.designPatern.flyweight;

public class Cow implements Animal{
	
	private String name;
	@Override
	public void setName(String name) {
		this.name= name;
		
	}

	@Override
	public void printAnimalAttributes() {
		System.out.println("Name of animal : "+ this.name);
		System.out.println("Number of eyes of "+this.name+" : "+ CommonSharableClass.eyes);
		System.out.println("Number of legs of "+this.name+" : "+ CommonSharableClass.legs);
		System.out.println("Number of nose of "+this.name+" : "+ CommonSharableClass.nose);
		System.out.println("Number of talis of "+this.name+" : "+ CommonSharableClass.tail);
	}

}
