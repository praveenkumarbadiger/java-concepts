package com.designPatern.abstractFactory;


public class TraineeProfessionAbstractFactory implements AbstractFactory{

	public Profession getProfession(String typeOfProfession) {
		if (typeOfProfession == null || typeOfProfession.isEmpty()) {
			return null;
		}
		if (typeOfProfession.equalsIgnoreCase("Engineer")) {
			return (Profession) new TraineeEngineer();
		}
		if (typeOfProfession.equalsIgnoreCase("Teacher")) {
			return (Profession) new TraineeTeacher();
		}
		return null;
	}
}
