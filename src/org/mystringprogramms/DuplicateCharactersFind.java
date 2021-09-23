package org.mystringprogramms;

import java.util.HashSet;

public class DuplicateCharactersFind {

	public static void main(String[] args) {
	
		String c="w3scddddhools";
		
		
		   char array1[]= c.toCharArray();
		   for(int i=0;i<array1.length;i++)
		   {
			   for(int j=i+1;j<array1.length;j++)
			   {
				   if(array1[i]==array1[j])
				   {
					 System.out.println(array1[j]);
				   }
			   }
		   }
		  

	}

}
