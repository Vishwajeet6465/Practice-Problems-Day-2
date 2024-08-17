package com.smallElement.array;
import java.util.*;
public class smallestElement {
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
		
		int min = arr[0];
		for(int i = 1; i < 10; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element of Array is: "+ min);
	}
}
