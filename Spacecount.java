package com.xworkz.practice;

public class Spacecount {

	public static void main(String[] args) {
		String name="a b c d";
		int count=1;
		for(int i=1;i<name.length();i++)
			{
			if (name.charAt(i)!=' ') 
			{
				count++;
			}
			
			}
		
		System.out.println("total words ="+count);
		String s=name.replaceAll("\\s","");  //removing whitespace
		System.out.println(s);
	}
	
	

}
