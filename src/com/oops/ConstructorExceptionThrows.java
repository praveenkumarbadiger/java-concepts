package com.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConstructorExceptionThrows {

	public static void main(String[] args) {
		
		// Uncomment following line only one at a time
		
		//P p = new P();
		
		//P p = new Child();
	}

}
class P {
	P()  throws IOException{
		System.out.println("Parent constructor");
	}
}
class Child extends P {
	Child() throws Exception{
		System.out.println("Parent constructor");
		throw new FileNotFoundException();
	}
}