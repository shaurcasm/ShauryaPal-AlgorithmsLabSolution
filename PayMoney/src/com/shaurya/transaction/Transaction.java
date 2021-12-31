package com.shaurya.transaction;

import java.util.Scanner;

public class Transaction {
	
	public void makeTransaction() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		
		int transArray[] = new int[size];
		
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			transArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		
		while(targetNo-- > 0) {
			boolean isAchieved = false;
			System.out.println("Enter the value of target");
			long target = sc.nextLong();
			long sum = 0;
			
			for (int i = 0; i < size; i++) {
				sum += transArray[i];
				
				if(sum >= target) {
					isAchieved = true;
					System.out.println("Target achieved after " + (i+ 1) + " transactions");
					System.out.println();
					break;
				}
			}
			
			if (!isAchieved)
				System.out.println("Given target is not achieved");
				System.out.println();
		}
		
		sc.close();
	}
}
