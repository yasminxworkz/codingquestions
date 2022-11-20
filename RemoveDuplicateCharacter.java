package com.xworkz.practice;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str="gadag";
		System.out.println("old string is: "+str);
		System.out.println("New String is: "+removeDupliChar(str));

	}
	
	public static String removeDupliChar(String str)
	{
		String newStr="";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(newStr.indexOf(ch)==-1) {
				newStr+=ch;
				//newStr=newStr+ch;
			}
		}
		return newStr;
	}

}
