package testPjt;

import java.util.Scanner;

public class Boj_2577 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int value = A*B*C;
	
		
		String str = Integer.toString(value); // int���� string����
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)-'0' == i) { //string ���� ������ char�� ����
					count++;
				}
			}
			System.out.println(count);
		}
		
	
		
	}

}
