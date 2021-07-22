package net.javacode;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {50,40,30,10,4,5};
		int l=a.length;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest: "+a[a.length-2]);
	}

}

