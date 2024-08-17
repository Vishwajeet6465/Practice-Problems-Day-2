package com.printevenposition.array;

import java.util.Random;

public class EvenPositionEle {
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
		
		System.out.println("Elements on even positions are: ");
		for(int i = 1; i < arr.length; i=i+2) {
			System.out.print(arr[i]+ " ");
		}
	}
}
