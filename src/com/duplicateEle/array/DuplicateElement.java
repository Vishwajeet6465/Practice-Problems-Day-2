package com.duplicateEle.array;

import java.util.Random;

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = new int[10];

		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			arr[i] = rand.nextInt(50);
		}
		
		System.out.println("Array elements are: ");
		for(int ele: arr) {
			System.out.print(ele+ " ");
		}
		System.out.println("");
		
		System.out.println("Duplicate elements are: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.printf(arr[j] + " ");
				}
				
			}
		}

	}
}
