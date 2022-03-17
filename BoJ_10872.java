package testPjt;

import java.util.Scanner;

public class BoJ_10872 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력값
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N]; //수열 A --> N만큼의 크기
		
		//N개의 입력값
		for (int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N ; i++) {
			if (X > A[i]) {
				System.out.print(A[i]+" ");
			}
			
		}
		
		sc.close();
	}
}
