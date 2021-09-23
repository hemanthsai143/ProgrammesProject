package searchingtechniques;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,5,6,9,10};
		int key=11;
		int low=a[0];
		int high=a.length-1;
		int m=(low+high)/2;
		int flag=0;
		while(low<=high)
		{
			if(a[m]==key)
			{
				System.out.println("Element found at" + m);
				flag=1;
				break;
				
			}
			else if (a[m]<key) {
				low=m+1;
				
			}
			else {
				high=m-1;
				
			}
			m=(low+high)/2;
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
		

	}

}
