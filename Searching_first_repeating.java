package com.pp;

public class Searching_first_repeating {

	public static void main(String[] args) {
		int ar[]={5,7,1,2,88,54,34,67,88,1};
		int count=0;
		int number=0;
		for(int i=0 ; i<ar.length; i++)
		{
			for(int j=0 ; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
					count++;
			}
			
			if(count==2)
			{
			number=ar[i];
			break;
			}
			count=0;
		}

		  System.out.println("first repeating number is :"+number);
	}
	

}
