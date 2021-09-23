package com.collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(5,1);
		m1.put(2, 1);
		m1.put(3, 3);
		    
//		Set<Entry<Integer,Integer>> s=m1.entrySet();
		for(Map.Entry<Integer, Integer> m:m1.entrySet())
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}*/
		
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(2, 3);
		m1.put(4, 5);
		m1.put(5, 6);
		
		for(Map.Entry<Integer,Integer> s:m1.entrySet())
		{
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		

	}

}
