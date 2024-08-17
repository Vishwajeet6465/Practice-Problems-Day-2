package com.print.array;

public class printElements {
	
	public static void main(String[] args) {
		int[] arr = new int[] {23, 36, 48, 93, 87, 31, 94, 64, 53, 45};
		
		for(int elements:arr) {
			System.out.print(elements);
			System.out.print(" ");
		}
	}
}
