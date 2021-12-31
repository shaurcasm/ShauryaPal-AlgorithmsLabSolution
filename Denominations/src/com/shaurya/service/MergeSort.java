package com.shaurya.service;

public class MergeSort {
	
	public void sort(int arr[], int start, int end) {
		if(start >= end)
			return;
		
		int partition = start + (end - start) / 2;
		sort(arr, start, partition);
		sort(arr, partition + 1, end);
		merge(arr, start, partition, end);
	}
	
	void merge(int arr[], int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		
		for(int j = 0; j < n2; j++)
			R[j] = arr[middle + j + 1];
		
		int i = 0, j = 0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(L[i] >= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
