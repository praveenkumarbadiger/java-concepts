package com.serializeAnObject;

import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("praveen", 20);
		
		Optional<String> s = ObjectSerializer.convertObjectToString(p);
		
		System.out.println(s);
		
		Optional<Person> p1  = ObjectSerializer.convertStringToObject(s.get());
		
	}

}
