package com.designPatern.abstractFactory;

public class AbstractFactoryProvider {
	public static AbstractFactory getProfession(boolean isTrainee) {
		if(isTrainee) {
			return new TraineeProfessionAbstractFactory();
		}else {
			return new ProfessionAbstractFactory();
		}
	}
}
