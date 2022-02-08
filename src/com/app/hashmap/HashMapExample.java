package com.app.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(10,1.0f);
		
		for(int i = 0; i< 20 ; i++ ) {
			map.put(i,i);
		}
		System.out.println(map);
	}
}
