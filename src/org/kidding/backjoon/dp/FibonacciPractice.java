package org.kidding.backjoon.dp;

import java.util.Scanner;

public class FibonacciPractice {

	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		arr = new int[n+1];
		for(int i=0; i<n+1; i++) {
			arr[i] = -1;
		}
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(getFibo(n));
		System.out.println(getFiboBetter(n));

	}
	
	//�Ϲ����� ��� ȣ�� ���. �׷��� �̷��� �ϸ� �ߺ� ȣ���� �Ǿ� ������ ������. 
	static int getFibo(int a) {
		if(a == 0) return 0;
		if(a == 1) return 1;
		
		return getFibo(a-1) + getFibo(a-2);
	}
	
	static int getFiboBetter(int a) {
		if(arr[a] == -1) {
			arr[a] = getFiboBetter(a-1) + getFiboBetter(a-2);
		}
		return arr[a];
	}
}
