package org.numbers;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		String armstrongnumber=" ";
		for(int i=1;i<=1000;i++)
		{
			int no=i;
			int temp=no;
			int rem=0,rev=0;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev+(rem*rem*rem);
				temp=temp/10;
			}
			if(rev==no && no>10)
			{
				armstrongnumber=armstrongnumber+no+" ";
			}
			
			
		}
		System.out.println(armstrongnumber);

	}

}
