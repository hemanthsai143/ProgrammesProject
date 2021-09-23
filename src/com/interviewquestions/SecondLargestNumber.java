package com.interviewquestions;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {20,10,80,90};
		Arrays.sort(array);
		System.out.println(array[array.length-2]);

	}

}
