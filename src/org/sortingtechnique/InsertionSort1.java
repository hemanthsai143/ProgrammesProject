package org.sortingtechnique;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[] a= {23,45,1,2,3};
		int j,temp;
		//25,1,24
		
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
