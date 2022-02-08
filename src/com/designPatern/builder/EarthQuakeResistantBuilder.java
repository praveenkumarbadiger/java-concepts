package com.designPatern.builder;

public class EarthQuakeResistantBuilder implements Builder {
	
	private Home earthQuakeResistantHome = new Home();

	@Override
	public void buildFloors() {
		earthQuakeResistantHome.setFloor("Wooden floor");
	}

	@Override
	public void buildWalls() {
		earthQuakeResistantHome.setFloor("Wooden walls");
	}

	@Override
	public void buildTerrace() {
		earthQuakeResistantHome.setFloor("Wooden terrace");
	}

	@Override
	public Home getComplexHomeObject() {
		return earthQuakeResistantHome;
	}

}
