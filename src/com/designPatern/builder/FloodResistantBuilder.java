package com.designPatern.builder;

public class FloodResistantBuilder implements Builder {
	
	private Home floodResistantHome = new Home();

	@Override
	public void buildFloors() {
		floodResistantHome.setFloor("Cement floor");
	}

	@Override
	public void buildWalls() {
		floodResistantHome.setFloor("Cement walls");
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.setFloor("Cement terrace");
	}

	@Override
	public Home getComplexHomeObject() {
		return floodResistantHome;
	}

}
