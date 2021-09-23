package com.interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElementsArray {

	public static void main(String[] args) {
		String duplicates[]=new String[] {"Java","Spring","Java","Hibernate","Spring"};
		  Set<String> nonduplicates=new HashSet<String>();
		  Set<String> duplicates1=new HashSet<String>();
		  for(String str:duplicates)
		  {
			  if(!nonduplicates.contains(str))
			  {
				  nonduplicates.add(str);
			  }
			  else
			  {
				  duplicates1.add(str);
			  }
		  }
		  System.out.println(duplicates1);
		
		

	}

}
