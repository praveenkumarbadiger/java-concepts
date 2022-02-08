package com.app.generics;

public class MyGenericClass<T> {

	T data;
	MyGenericClass(T data){
		this.data = data;
	}
	
	public T getObject() {
		return this.data;
	}
	
	public void displayObjectDetails() {
		System.out.println("The type of object: "+data.getClass().getName());
	}
	
	public static void main(String[] args) {
		// passing String generic
		MyGenericClass<String> name = new MyGenericClass<String>("Praveenkumar");
		name.displayObjectDetails();
		System.out.println(name.getObject());
		
		MyGenericClass<Double> amount = new MyGenericClass<>(10.25);
		amount.displayObjectDetails();
		System.out.println(amount.getObject());
		
	}
}
