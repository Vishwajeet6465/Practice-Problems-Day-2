package com.largeElement.array;

import java.util.Random;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		System.out.println("Array elements are: ");
		for(int ele: arr) {
			System.out.print(ele+ " ");
		}
		System.out.println("");
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println("Second Largest element is: "+ arr[arr.length-2]);

	}
}
