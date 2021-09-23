package org.mystringprogramms;

public class Removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str2=new StringBuilder("Hemanth");
		
		
		for(int i=0;i<str2.length();i++)
		{
			
			Character ch=str2.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				str2.deleteCharAt(i);
			}
		}
		System.out.println(str2);

	}

}
