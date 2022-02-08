package com.oops;

/**
 * There is <b>NO</b> static method override, it is actually method hiding
 * @author prave
 *
 */
public class StaticMethodOveride {

	public static void main(String[] args) {
		// There is NO static method override, it is actually method hiding
		
		// 1.
		Student st = new Student();
		st.getStandard();
		
		// 2.
		Student st1 = new DegreeStudent();
		st1.getStandard();
		
		// 3.
		DegreeStudent degreeStudent = new DegreeStudent();
		degreeStudent.getStandard();
	}

}


class Student {
	static void getStandard() {
		System.out.println("10th standard.");
	}
}

class DegreeStudent extends Student {
	static void getStandard() {
		System.out.println("Degree standard.");
	}
}