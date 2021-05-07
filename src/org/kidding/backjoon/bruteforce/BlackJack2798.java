package org.kidding.backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack2798 {

	//1 �ݺ������� Ǯ���
	//2 ��ͷδ�? 5 6 7 8 9  // https://zoonvivor.tistory.com/160 ��Ʈ��ŷ ���� �Ŀ�! 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//�ٷ� �迭�� �ֱ�? �ƴϸ� StringTokenizer��...? 
		int[] arr = new int[n];
		//StringTokenizer�� �ٽ� �� ���� �̷���. ���� �ٲ�� �ٽ� �����. 
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;	//m�� ���� �ʴ� �ִ�
		
		for(int i=0; i<n-2; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				for(int k=j+1; k<n; k++) {
					int temp = arr[i]+arr[j]+arr[k];
					System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k] + " = " + temp);
					if(temp > m) {
						continue;
					}else {
						if(temp>=max) {
							max = temp;
						}
					}
				}
			}			
		}
		System.out.println(max);
		
		
	}   
	
	
	
}
