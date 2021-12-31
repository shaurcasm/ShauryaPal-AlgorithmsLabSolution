package com.shaurya.service;


public class CountTheNotes {
	
	public void countNotes(int denomArray[], int amount) {
		int size = denomArray.length;
		int notes[] = new int[size];
		
		int balance = amount;
		
		for(int i = 0; i < size; i++) {
			notes[i] = balance / denomArray[i];
			balance = balance % denomArray[i];
			
			if(balance <= 0)
				break;
		}
		
		if (balance > 0) {
			System.out.println("Payment failed");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i = 0; i < size; i++) {
				if(notes[i] > 0)
					System.out.println(denomArray[i] + ":" + notes[i]);
			}
		}
	}
}
