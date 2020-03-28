package com.epam.TddandJunit;

public class CheckingAInFirstTwoCharacters {
	
	public String skip(String string) {
		String result=string;
		if((string.charAt(0) =='A')&&(string.charAt(1) =='A')) {
			 result = string.substring(2, string.length());
		}
		else if(string.charAt(1) =='A') {
			 result = string.charAt(0)+string.substring(2,string.length());
		}
		else if(string.charAt(0) =='A') {
			 result = string.substring(1, string.length());
		}
		return result;
		
	}


}
