package com.qa.util;

public class TestUtil {

	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICIT_WAIT = 30;

	public static boolean stringMatch(String sentence, String keyword) {
		if ((sentence.toLowerCase().trim()).equals(keyword.toLowerCase().trim())) {
			System.out.println("not found");
			return false;
		}
		else {  
			System.out.println("I found the keyword");
			return true;
		} 

	}
	
}
