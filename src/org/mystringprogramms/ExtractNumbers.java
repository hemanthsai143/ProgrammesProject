package org.mystringprogramms;

public class ExtractNumbers {

	public static void main(String[] args) {
		
		
		String s="TestCasePassed100TestCaseFailed25TestCaseSkipped200";
		String num="";
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
			}
			else
			{
				if(!num.equals(""))
				{
					sum=sum+Integer.parseInt(num);
					num="";
				}
				
			}
			if(i==s.length()-1 && num!="")
			{
				sum=sum+Integer.parseInt(num);
			}
			
		}
		System.out.println(sum);
	}

}
