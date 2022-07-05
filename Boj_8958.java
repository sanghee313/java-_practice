package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(bf.readLine()); //입력 5가지 


		for (int i = 0; i < M ; i++) {
			//OOXXOXOXOOX입력 -> string-> char[] 배열로 대입 
 			String quest = bf.readLine();
 			
			char[] S  = new char[quest.length()];
			for (int j = 0; j < quest.length(); j++) {
				S[j] = quest.charAt(j);
			}
			//System.out.println(Arrays.toString(S));
			int cnt =0;
			int result = 0;

			for (int j = 0; j < S.length; j++) {
				if(S[j]=='O') {
					cnt++;
				}
				else {
					cnt=0;
				}
				result +=cnt;
			}
			System.out.println(result);
		}
	}
}	
