package com.designPatern.prototype;

public abstract class Profession implements Cloneable {
	
	public int id;
	public String name;
	
	abstract void print();
	
	public  Object cloneMethod() {
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
