package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2675 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//문제 개수 
		int A = Integer.parseInt(bf.readLine());
		
		//반복 횟수 
		int R;
		//문자형 배열
		String[] str;
		//문자형 배열
		String S;
		
 		for (int i = 0; i < A; i++) {
 			//ex) 2 abc 입력
 			str = bf.readLine().split(" ");
			//str[0] = 2, str[1] =abc 으로 대입됨 
			R = Integer.parseInt(str[0]); //숫자 2 대입 
			S = str[1];      //문자 str로 대입 됨.
			
			int cnt = S.length();
			for (int j = 0; j < cnt; j++) {
				for (int j2 = 0; j2 < R; j2++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
