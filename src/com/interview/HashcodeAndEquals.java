package com.interview;

import java.util.HashMap;
import java.util.Map;

public class HashcodeAndEquals {

	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		Map<Employee, String> emap = new HashMap<Employee, String>();
		emap.put(e1, "Praveen");
		emap.put(e2, "kumar");
		
		System.out.println(emap.size());
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();
		imap.put(i1, 1);
		imap.put(i2, 1);
		
		System.out.println(imap.size());
	}

}

class Employee{
	int id;
	Employee(int id){
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(id!=other.id) {
			return false;
		}
		if(this == obj)
			return true;
		
		return true;
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
}
