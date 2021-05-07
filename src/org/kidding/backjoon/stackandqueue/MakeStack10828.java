package org.kidding.backjoon.stackandqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeStack10828 {
	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    
	    int[] arr = new int[n];
	    int size = 0;	//가장 위의 수 추출용
	    
	    for(int i=0; i<n; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	switch(st.nextToken()) {
	    	case "push":
	    		push(arr, size, Integer.parseInt(st.nextToken()));
	    		size++;
	    		break;
	    	case "pop":
	    		pop(arr, size);
	    		size--;
	    		break;
	    	case "size":
	    	case "empty":
	    	}

	    }
	    
	    
	}
	
	static void push(int[] arr, int size, int input) {
		arr[size] = input;
		return;
	}
	
	static void pop(int[] arr, int size) {
		if(size == 0) {
			System.out.println("-1");
		}
		int temp = arr[size];
		arr[size] = 0;
		System.out.println(temp);
		size--;
	}
	
	static int size(int[] arr, int size) {
		return size;
	}
	
	static int empty(int[] arr, int size) {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
