package com.designPatern.builder;

public interface Builder {
	
	public void buildFloors();
	
	public void buildWalls();
	
	public void buildTerrace();
	
	public Home getComplexHomeObject();
}
