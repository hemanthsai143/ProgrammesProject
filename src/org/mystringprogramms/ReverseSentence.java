package org.mystringprogramms;

public class ReverseSentence {
	public static void main(String[] args) {
		
	String originalSen="Welcome to Genpact";
	String words[]=originalSen.split(" ");
	String reverseSen="";
	
	for(int i=words.length-1;i>=0;i--)
	{
		
		reverseSen=reverseSen+words[i]+" ";
	}
	System.out.println(reverseSen);
	
	
	}

}
