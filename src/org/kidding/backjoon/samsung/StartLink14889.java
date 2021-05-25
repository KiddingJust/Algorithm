package org.kidding.backjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StartLink14889 {
	
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		visited = new boolean[n];
		ArrayList<Integer> team = new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(arr, team, 0, 0);
	}
	
	static void dfs(int[][] arr, ArrayList<Integer> team, int start, int depth) {
		System.out.println("dfs start: " + start + ", depth: " + depth);
		if(depth > arr.length/2) {
			System.out.println(team.toString());
			return;
		}
		
		if(start != 0 && depth == 1) {
			System.out.println("return?");
			return;
		}
		
		for(int i=start; i<arr.length; i++) {
			System.out.println("start가 이거일 때 루프문");
			System.out.println("start: " + start + ", i: " + i);
			if(visited[i] == false) {
				visited[i] = true;
				team.add(i);
				start++;
				depth++;
				dfs(arr, team, start, depth);
				team.remove(depth-2);
				start--;
				depth--;
				visited[i] =false;
			}

			
		}
	}
}
