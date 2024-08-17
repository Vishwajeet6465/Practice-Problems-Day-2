package com.print.array;

import java.util.Random;

public class ReverseOrder {
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
		
		System.out.println("Array elements in reverse order are: ");
		for(int i = 9; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
