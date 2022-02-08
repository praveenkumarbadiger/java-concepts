package com.designPatern.flyweight;

public class AnimalClient {
	public static void main(String[] args) {
		Animal catAnimal =  AnimalFactory.getCat("CAT");
		catAnimal.printAnimalAttributes();
		
		Animal catAnimal2 =  AnimalFactory.getCat("CAT");
		catAnimal2.printAnimalAttributes();
		
		Animal cowAnimal =  AnimalFactory.getCow("COW");
		cowAnimal.printAnimalAttributes();
		
		Animal dogAnimal =  AnimalFactory.getDog("DOG");
		dogAnimal.printAnimalAttributes();
		
		
		System.out.println(catAnimal.hashCode());
		
		System.out.println(catAnimal2.hashCode());
	
		System.out.println(cowAnimal.hashCode());
		
		System.out.println(dogAnimal.hashCode());
	}
}
