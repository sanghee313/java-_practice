package testPjt;

import java.util.Scanner;

public class Boj_1110 {
	public static void main(String[] args) {
		// scanner �Է� 
		Scanner sc = new Scanner( System.in);
		
		int N = sc.nextInt(); // ���� N  
		sc.close();
		
		int cnt = 0;  // count ���� ����
		int copy = N; // ����Ǵ� N�� �񱳰�
		
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
