package com.app;

public class LeaderElementOfArray {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		int halfSize = arr.length/2;
		int i , j, count;

		for(i=0;i<arr.length;i++) {
		    count=0;
			j=0;
			for(j=0;j<arr.length-1;j++)
			{ 
				if(i==j)
					j=j+1;
				if(arr[i]==arr[j])
					count++;	
			}

			if(count>=halfSize)
			{
				System.out.println("Leader Element Of Array Is:- "+arr[i]);
				break;
			}

		}
	}

}
