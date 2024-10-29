package com.demo.test;

import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {1,12,9,5,6,10};
		System.out.println("Given Array");
      
      System.out.println(Arrays.toString(arr));
      heapsort(arr);
      System.out.println("Sorted Array");
	  System.out.println(Arrays.toString(arr));
	}

	private static void heapsort(int[] arr) {
     int n=arr.length;
     for(int i=(n/2-1);i>=0;i--) {
     heapify(arr,n,i);
	}
	
	System.out.println(Arrays.toString(arr));
	
	for(int i=n-1;i>0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		heapify(arr,i,0);
		System.out.println("Sorted "+i);
		System.out.println(Arrays.toString(arr));
	}
	
	}
	
	
	
	private static void heapify(int[] arr, int n, int i) {
       int largest=i;
       int left=2*i+1;
       int right=2*i+2;
       
       
      if(left<n && arr[left]>arr[largest]);
      {
    	  largest=left;
      }
		if(right<n && arr[right]>arr[largest]);
		{
			largest=right;
		}
	
	if(largest!=i)
	{
		int temp=arr[i];
		 arr[i]=arr[largest];
		 arr[largest]=temp;
		
		 heapify(arr,n,i);
		
	}
	} 
}
 