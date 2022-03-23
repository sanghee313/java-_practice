package testPjt;

import java.util.Scanner;

public class Boj_1110 {
	public static void main(String[] args) {
		// scanner 입력 
		Scanner sc = new Scanner( System.in);
		
		int N = sc.nextInt(); // 정수 N  
		sc.close();
		
		int cnt = 0;  // count 개수 새기
		int copy = N; // 변경되는 N의 비교값
		
		while (true) {
			
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			cnt++;
			
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
		
	}
}
