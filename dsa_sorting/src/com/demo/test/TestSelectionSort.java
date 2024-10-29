package com.demo.test;

import java.util.Arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
		int [] arr= {23,4,1,5,20,36,78,3,7};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
		
 }
	private static void selectionsort(int[]arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[min_idx]) 
				{
					min_idx=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
			System.out.println("Minimum Number "+arr[i]+"==="+arr[min_idx]);
			System.out.println(Arrays.toString(arr));
		}
	}
	

}
