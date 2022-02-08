package com.designPatern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {
	
	private static final Map<String, Animal> animalMap = new HashMap<>();
	
	public static Animal getCat(String name) {
		String key = name + "-CAT";
		
		Animal animal = null;
		
		if(animalMap.containsKey(key)) {
			animal =  animalMap.get(key);
		}else {
			animal = new Cat();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}
	
	public static Animal getDog(String name) {
		String key = name + "-DOG";
		
		Animal animal = null;
		
		if(animalMap.containsKey(key)) {
			animal =  animalMap.get(key);
		}else {
			animal = new Cat();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}
	
	public static Animal getCow(String name) {
		String key = name + "-COW";
		
		Animal animal = null;
		
		if(animalMap.containsKey(key)) {
			animal =  animalMap.get(key);
		}else {
			animal = new Cat();
			animal.setName(name);
			animalMap.put(key, animal);
		}
		return animal;
	}

}
