package org.mystringprogramms;

public class Noofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hemanth";
		char ch[]=str.toCharArray();
		int count=0;
		
		for(char ch1:ch)
		{
			switch(ch1)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println(count);
	     
		
	}

}
