package com.designPatern.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		
		Profession doctorProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctorProfession);
		
		Profession engineerProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engineerProfession);
		
		Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherProfession);
		
		Profession teacherProfessionNew = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherProfessionNew);
	}

}
