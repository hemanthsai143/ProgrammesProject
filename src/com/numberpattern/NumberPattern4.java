package com.numberpattern;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
			
		{
			int k=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k=k-1;
			}
			System.out.println();
		}

	}

}
