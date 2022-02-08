package com.designPatern.builder;

public class BuilderTest {

	public static void main(String[] args) {
		EarthQuakeResistantBuilder  earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		FloodResistantBuilder  floodResistantBuilder = new FloodResistantBuilder();
		
		//Director director = new Director(earthQuakeResistantBuilder);
		Director director = new Director(floodResistantBuilder);
		
		director.manageRequiredHomeConstruction();
		
		Home home =director.getComplexObjectHome();
		
		System.out.println(home);
		System.out.println(home.getFloor());
	}

}
