package com.exceptions;

import java.io.IOException;

public class Follower extends Lead{

	static void test() throws IOException{
		System.out.println("Follower Exception");
	}
	
	public static void main(String[] args) {
		Lead lead = new Follower();
		
		try {
			lead.test();
		} catch (Exception e) {
			System.out.println("Catch exception!!!!");
		}

	}

}

class Lead{
	static void test() throws Exception{
		System.out.println("Lead IOException");
	}
}