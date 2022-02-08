package com.designPatern.singleton.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("doctor");
		doc.print();

		
		doc = professionFactory.getProfession("engineer");
		doc.print();
		
		doc = professionFactory.getProfession("teacher");
		doc.print();
	}

}
