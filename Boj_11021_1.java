package testPjt;

import java.util.Scanner;

public class Boj_11021_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //시스템 입력 인식
		int count = in.nextInt(); // 카운트 개수 세기 int 값으로..
		
		// count 수 만큼 덧셈 개수 만들기 (A + B)
		for (int i = 0; i < count; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			//호출
			System.out.printf("Case #%d: %d + %d = %d\n",i+1,A,B,A+B);
			
		} 
		in.close();
		
	}

}
