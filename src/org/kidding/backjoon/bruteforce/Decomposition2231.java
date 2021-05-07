package org.kidding.backjoon.bruteforce;

import java.util.Scanner;

public class Decomposition2231 {
	
	//216 => 198   (198 + 1 + 9 + 8)
	//256 => 245   (245 + 2 + 4 + 5)
	public static void main(String[] args) {
		//�� �Է¹ޱ� 
		
		//�ϳ��ϳ� �ڸ���
		
		//loop�� ������,
		//���� ���ڸ��� + 9 + 9 ���� ������.  
		//218�� ��� 199�� ��. ���� ���� ������ ���� ������. 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int answer = 0;
		int decomp = 0;
		int start = 0;
		
		int first = 0;
		int pow = 0;
		while(true) {
			if(temp/10 > 0) {
				first = temp/10;
				temp /= 10;
				pow++;
			}else {
				break;
			}
		}
		start = (int) (first*Math.pow(10, pow)-1);
		System.out.println("start: " + start);
		
		for(int i=start; i<n; i++) {
			decomp = i;
			int num = i;
			while(num>0) {
				System.out.println("num: " + num);
				decomp += num%10;
				System.out.println("decomp: " + decomp);
				num = num/10;
				System.out.println("num: " + num);
			}
			if(decomp == n) {
				break;
			}
		}
		
		System.out.println(decomp);
		
	}
}
