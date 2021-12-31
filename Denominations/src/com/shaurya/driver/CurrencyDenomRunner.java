package com.shaurya.driver;

import java.util.Scanner;

import com.shaurya.service.CountTheNotes;
import com.shaurya.service.MergeSort;

public class CurrencyDenomRunner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of currency denominations");
		int size = sc.nextInt();
		
		int denomArray[] = new int[size];
		
		System.out.println("Enter the currency denominations value:");
		for(int i = 0; i < size; i++)
			denomArray[i] = sc.nextInt();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(denomArray, 0, size - 1);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		CountTheNotes counter = new CountTheNotes();
		counter.countNotes(denomArray, amount);
		
		sc.close();
	}

}
