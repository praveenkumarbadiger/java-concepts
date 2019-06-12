package com.app.strings;

public class StringsExamples {
	public static void main(String[] args) {
	
		//countNoOfAccurChar();
		//sortCharsWithoutCompare();
		sortElementsBasedOnOccuranceAndSorting();
		
	}

	
	// Count down no of occurrence of each character in string.
	public static void countNoOfAccurChar() {
		String st="PraveenKumaRBadiGer@gmail.com";
		char[] chars=st.toCharArray();
		int[] rs=new int[128];
		for (int i = 0; i < chars.length; i++) {
			rs[chars[i]]++;
		}
		
		for (int i = 0; i < rs.length; i++) {
			// No Of occurrence 
			if(rs[i] > 0) {
				System.out.println("Occurance of  '"+(char)i + "' ----> "+rs[i] );
			}
			/*// Duplicate
			if(rs[i] > 1) {
				System.out.println("Duplicate of  '"+(char)i + "' ----> "+rs[i] );
			}
			// Unique
			if(rs[i] == 1) {
				System.out.println("Unique of  '"+(char)i + "' ----> "+rs[i] );
			}*/
			/*// Missing
			if(rs[i] == 0) {
				System.out.println("Missing of  '"+(char)i + "' ----> "+rs[i] );
			}*/
		}
	}
	// Print character in sorted manner without comparing each other.
	public static void sortCharsWithoutCompare() {
		String st="AMMA AVANI";
		char[] chars=st.toCharArray();
		int[] rs=new int[128];
		for (int i = 0; i < chars.length; i++) {
			rs[chars[i]]++;
		}
		
		for (int i = 0; i < rs.length; i++) {
			while(rs[i] > 0) {
				System.out.print((char)i);
				rs[i]--;
			}
		}
	}
	
	
	public static void sortElementsBasedOnOccuranceAndSorting() {
		String[] str=new String[] {"o","m","n","t","m","g","b","s","w","b","z","a"};
		char[] chars=new char[str.length];
		int[] rs=new int[129];
		
		for(int i=0;i<str.length;i++) {
			chars[i]=str[i].charAt(0);
		}
		
		for(int i=0;i<chars.length;i++) {
			rs[chars[i]]++;
		}
		for(int i=0;i<rs.length;i++) {
			while(rs[i]>0) {
				System.out.print((char)i);
				rs[i]--;
			}
		}
	}
}