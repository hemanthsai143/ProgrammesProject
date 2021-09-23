package com.collections1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet<Integer>();
		s1.add(12);
		s1.add(1);
		s1.add(2);
		   Iterator itr=s1.iterator();
		   while(itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }

	}

}
