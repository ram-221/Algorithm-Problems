package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		System.out.println("Before Sorting Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\n After Sortng Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort(); 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size =scan.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the "+size+" Element of Array");
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		bubble.bubbleSort(array);
		scan.close();
	}
}
