package org.numbers;

public class FactorialRecursion {
	static int fact=1;
	public static void main(String[] args)
	{
      FactorialRecursion f1=new FactorialRecursion();
      System.out.println(f1.calFact(9));
		
		}
	
	int calFact(int no)
	{
		if(no>1)
		{
			fact=fact*no;
			calFact(no-1);
		}
		
		return fact;
	}
}
