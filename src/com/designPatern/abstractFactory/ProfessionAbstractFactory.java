package com.designPatern.abstractFactory;

public class ProfessionAbstractFactory implements AbstractFactory {

	public Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null || typeOfProfession.isEmpty()) {
			return null;
		}
		if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return new Engineer();
		}
		if (typeOfProfession.equalsIgnoreCase("Teacher")) {
			return new Teacher();
		}
		return null;
	}
}
