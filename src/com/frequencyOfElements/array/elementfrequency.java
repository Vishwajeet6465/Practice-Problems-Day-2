package com.frequencyOfElements.array;
import java.util.*;

public class elementfrequency {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		System.out.println("Array elements are as follows: ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
		int [] freq = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    freq[j] = visited;  
                }  
            }  
            if(freq[i] != visited)  
                freq[i] = count;  
        }  
        System.out.println("");
        //Displays the frequency of each element present in array   
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != visited)  
                System.out.println("Element: " + arr[i] + " Frequency: " + freq[i]);  
        }  
	}
}
