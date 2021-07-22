package net.javacode;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1=new String();
		String string2=new String();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string 1: ");
		string1=sc.nextLine();
		System.out.println("Enter string 2: ");
		string2=sc.nextLine();
		
		String new_string1=string1.toLowerCase();
		String new_string2=string2.toLowerCase();
		
		if(new_string1.length()!=new_string2.length())
		{
			System.out.println("Both string are not anagram");
		}
		else
		{
			char[] str1=new_string1.toCharArray();
			char[] str2=new_string2.toCharArray();
			
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			int flag=1;
			for(int i=0;i<str1.length;i++)
			{
				if(str1[i]!=str2[i])
				{
					flag=0;
				}
			}
			if(flag==0)
				System.out.println("Two strings are not ananagram");

			else
			System.out.println("Two strings ananagram");
		}
	}

}
