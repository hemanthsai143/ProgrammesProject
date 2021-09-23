package com.interviewquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,2,2,3,3,3,4,4,4,5,5,5,1};
		List<Integer> l1=new ArrayList<Integer>();
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			int k=1;
			if(!l1.contains(array[i]))
			{
				l1.add(array[i]);
				for(int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						k++;
					}
				}
				m1.put(array[i], k);
			}
			
			
			
		}
		
		Set<Entry<Integer, Integer>> s=m1.entrySet();
		for(Map.Entry<Integer, Integer> m:s)
		{
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		

	}

}
