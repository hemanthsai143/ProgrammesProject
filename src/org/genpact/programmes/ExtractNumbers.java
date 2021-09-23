package org.genpact.programmes;

public class ExtractNumbers {

	public static void main(String[] args) {
		String s="TestCase200Passed150Failed50";
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
				if(num!="")
				{
					sum=sum+Integer.parseInt(num);
					num="";
				}
				
			
			}
			if((num!="") && (i==s.length()-1))
			{
				sum=sum+Integer.parseInt(num);
				num="";
				
			}
			
		}
		System.out.println(sum);

	}

}
