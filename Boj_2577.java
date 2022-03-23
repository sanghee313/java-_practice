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
	
		
		String str = Integer.toString(value); // int값을 string으로
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)-'0' == i) { //string 값을 각각의 char로 변형
					count++;
				}
			}
			System.out.println(count);
		}
		
	
		
	}

}
