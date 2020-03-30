package com.app;

public class SegregateZerosAndOnesInArray {
	public static void main(String[] args) {
		  int a[] = {1, 0, 0, 1, 0, 1}; 
		int zeroCount=0;
		int oneCount =0;
 
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) zeroCount++;
            else if (a[i] == 1) oneCount++;
            else throw new IllegalArgumentException();
        }
 
        for (int i = 0; i < zeroCount; i++) {
            a[i] = 0;
        }
 
        for (int i = zeroCount; i < zeroCount + oneCount; i++) {
            a[i] = 1;
        }
        System.out.println("Array After Segration");
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
    }
}
