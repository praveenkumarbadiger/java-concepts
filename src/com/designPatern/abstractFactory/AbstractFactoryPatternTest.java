package com.designPatern.abstractFactory;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = AbstractFactoryProvider.getProfession(true);
		
		Profession  profession = (Profession) abstractFactory.getProfession("Engineer");
		
		profession.print();
	}

}
