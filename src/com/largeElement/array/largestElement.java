package com.largeElement.array;

import java.util.Random;

public class largestElement {
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
		
		int max = arr[0];
		for(int i = 1; i < 10; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("Maximum element of Array is: "+ max);
	}
}
