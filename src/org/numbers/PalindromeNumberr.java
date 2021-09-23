package org.numbers;

public class PalindromeNumberr {

	public static void main(String[] args) {
		
		String palindromenumber=" ";
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int temp=no;
			int rem=0,rev=0;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==no && no>10)
			{
				palindromenumber=palindromenumber+no+" ";
			}
			
			
		}
		System.out.println(palindromenumber);
	}

}
