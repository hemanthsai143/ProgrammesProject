package com.interviewquestions;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] array= {1,2,3,4,6};
				int number=missingNumber(array,6);
				System.out.println(number);
	}
	
	private static int missingNumber(int [] array,int n) {
		int expectedSum=(n*(n+1)/2);
		int actualSum=0;
		for(int i:array)
		{
			actualSum=actualSum+i;
		}
		
		return expectedSum-actualSum;
		
	}

}
