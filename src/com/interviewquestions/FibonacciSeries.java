package com.interviewquestions;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n1=0,n2=1,sum=0,max=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<=max;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		
		
		
	}

}
