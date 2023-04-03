package com.hdfctech;

import java.util.regex.Pattern;

public class ReverseWords {

	static String reverseWords(String str) {
		Pattern p= Pattern.compile("\\S");
		String [] splitValues=str.split(" ");
		String result="";
		for(int i=0;i<splitValues.length;i++) {
			if(i==splitValues.length-1) {
				result=splitValues[i]+result;
			}
			else {
				result= " " + splitValues[i]+result;
			}
			
		}
		return result;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseWords=reverseWords("ddd vv ttg  dd  sss fff");
		System.out.println(reverseWords);
		
	}

}
