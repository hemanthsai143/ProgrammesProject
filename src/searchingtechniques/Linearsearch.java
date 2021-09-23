package searchingtechniques;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,1,24,2,9};
		int elementtoSearch=99;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==elementtoSearch)
			{
			System.out.println("Found"+elementtoSearch+" at index"+" "+i);
			flag=1;
			break;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
		
		
		

	}

}
