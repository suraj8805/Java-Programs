package net.javacode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {10,2,30,40,50};
		int l=a.length;
		
		getSmallestNumber(a,l);

	}

	private static void getSmallestNumber(Integer []arr, int l) {
		// TODO Auto-generated method stub
		
		List <Integer> list=Arrays.asList(arr);
		
		Collections.sort(list);
		int n=list.get(1);
		
		System.out.println("Second smallest Number:"+n);
	}

}
