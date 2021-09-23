package org.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String args[]) {
	
	String primeNumbers="";
	List<Integer> l1= new ArrayList<Integer>();
	for(int i=1;i<=1000;i++)
	{
		int counter=0;
		for(int j=2;j<=i-1;j++)
		{
			
			if(i%j==0)
			{
				counter=1;
				break;
			}
			
			
		}
		if(counter==0)
		{
			primeNumbers=primeNumbers+i+" ";
		}
		
	}
	
  String[] p1=primeNumbers.split("\\s");
   for(int i=0;i<p1.length;i++)
   {
	   
	       int num=Integer.parseInt(p1[i]);
	       int rem=0,rev=0;
	       int temp=num;
	       while(temp!=0)
	       {
	    	   rem=temp%10;
	    	   rev=rev*10+rem;
	    	   temp=temp/10;
	    	   }
	       if(rev==num)
	       {
	    	   l1.add(num);
	       }
   }
	
   System.out.println(l1);
	


		
		
	
		
	}
	}
		
	
