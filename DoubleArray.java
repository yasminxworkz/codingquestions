package com.xworkz.practice;

public class DoubleArray {
	//Java program to find value
	// if we double the value after
	// every successful search
	// Function to Find the value of k
	static int findValue(int arr[], int n, int k) {
		boolean exist = true;
		// Search for k. After every successful
		// search, double k and change exist to true
		// and search again for k from the start of array
		while (exist) {
			exist = false;
			for (int i = 0; i < n; i++) {
				// Check is a[i] is equal to k
				if (arr[i] == k) {
					k *= 2;
					exist = true;
					break;
				}
			}
		}
		return k;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 8, 1 }, k = 2;
		int n = arr.length;
		System.out.print(findValue(arr, n, k));


	}

}
