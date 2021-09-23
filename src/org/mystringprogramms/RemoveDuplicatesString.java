package org.mystringprogramms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	
	public static String removeDuplicates(String str)
	{
		
	   Set<Character> s1=new HashSet<Character>();
	   StringBuilder s2=new StringBuilder();
	   for(int i=0;i<str.length();i++)
	   {
		
		Character ch=str.charAt(i);
		while(!s1.contains(ch))
		{
			s2.append(ch);
			s1.add(ch);
		}
		
	   }
		return s2.toString();
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		String str="sandeep";
		System.out.println(removeDuplicates(str));
		

	}
}
