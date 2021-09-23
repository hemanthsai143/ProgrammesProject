package org.genpact.programmes;

import java.util.ArrayList;
import java.util.List;

import org.numbers.PrimeNumbers;

public class PrintPrimeandPalindrome {

	public static void main(String[] args) {
		String primeNumbers="";
	ArrayList<Integer> l1=new ArrayList<Integer>();
		
		for(int i=1;i<=1000;i++)
		{
			int counter=0;
			for(int j=2;j<=i-1;j++)
			{
				
				if(i%j==0)
				{
					counter=1;
				}
			}
			if(counter==0)
			{
	      primeNumbers=primeNumbers+i+" ";
			}
		}
	String[] primeArray=primeNumbers.split("\\s");
	      for(int j=0;j<primeArray.length;j++)
	      {
	    	  int num=Integer.parseInt(primeArray[j]);
	    	  int temp=num;
	    	  int rem=0,rev=0;
	    	  while(temp!=0)
	    	  {
	    		  rem=temp%10;
	    		  rev=rev*10+rem;
	    		  temp=temp/10;
	    		  }
	    	 
	    	  if(num==rev)
	    	  {
	    		  l1.add(num);
	    	  }
	    	  
	      }
	      System.out.println(l1);
}
	       

}
