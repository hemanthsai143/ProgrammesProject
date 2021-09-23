package com.interviewquestions;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hemanth Sai";
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			String s="";
			while(i<str.length() && ch[i]!=' ')
			{
				s=s+ch[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s +s.length());
			}
		}

		

	}

}
