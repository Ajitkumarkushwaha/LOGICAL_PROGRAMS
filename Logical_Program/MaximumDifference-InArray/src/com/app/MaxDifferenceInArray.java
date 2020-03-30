package com.app;

public class MaxDifferenceInArray {
		  public static void main(String args[]) {
			  int arr[] = {10, 25, 65, 12, 120,  57};
			  
			  if(arr.length<3) {
			      System.out.println("Invalid Output Please Enter Atleast 3 Element");
			    }
			  else {
				  System.out.print("Maximum Difference Betwwen Two Number In Given Array Is:-");
				  int currMin = arr[0];
				    int maxDiff =arr[1]-arr[0];
				    for(int i = 1; i < arr.length; i++) {
				      if(arr[i] < currMin) {
				        currMin = arr[i];
				      } else if (maxDiff < arr[i] - currMin) {
				        maxDiff = arr[i] - currMin;
				      }
				    }
				    System.out.println(maxDiff);
			  }
		  }
}
