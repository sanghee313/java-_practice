package testPjt;

import java.util.Scanner;

public class Boj_11720 {
	/*
	 * 첫번째 줄 에 숫자의 개수 
	 * 두번째줄에도 숫자 입력 받음
	 * 각 자리에 겹치지 않는 숫자들을 더해줌 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //첫번째 숫자의 개수 
		
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum =0;
		
		for (int i = 0; i < cNum.length; i++) {
			sum +=cNum[i]-'0';
		}
		System.out.println(sum);
		
		sc.close();
	}
}
