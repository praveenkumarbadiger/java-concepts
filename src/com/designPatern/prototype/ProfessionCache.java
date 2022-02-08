package com.designPatern.prototype;

import java.util.Hashtable;

public class ProfessionCache {
	
	private static Hashtable<Integer, Profession> professionMap = new Hashtable<>();
	
	public static Profession getCloneNewProfession(int id) {
		
		Profession cachedProfessionInstance = professionMap.get(id);
		//return cachedProfessionInstance;
		return (Profession) cachedProfessionInstance.cloneMethod();
	}

	
	public static void loadProfessionCache() {
		Doctor doctor = new  Doctor();
		doctor.id = 1;
		professionMap.put(1, doctor);
		
		Engineer engineer = new Engineer();
		engineer.id = 2;
		professionMap.put(2, engineer);
		
		Teacher teacher= new Teacher();
		teacher.id = 3;
		professionMap.put(3,teacher);
	}
}
