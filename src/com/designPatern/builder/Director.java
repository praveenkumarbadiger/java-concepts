package com.designPatern.builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	
	public Home getComplexObjectHome() {
		return builder.getComplexHomeObject();
	}
	
	public void manageRequiredHomeConstruction() {
		this.builder.buildFloors();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}
}
