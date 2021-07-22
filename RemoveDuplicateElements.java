package net.javacode;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,20,40,30,30,50};
		
		int length=a.length;
		
		int j=getRemoveDuplicate(a,length); 
		
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}

	}

	private static int getRemoveDuplicate(int[] a, int length) {
		// TODO Auto-generated method stub
		
		
		if(length==0||length==1)
			return length;
		int j=0;
		for(int i=0;i<length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
			
		}
		a[j++]=a[length-1];
		return j;
	}

}
