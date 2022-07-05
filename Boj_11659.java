package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken()); //배열 M개
		int N = Integer.parseInt(st.nextToken()); //질문 개수 N개
		
		
		long[] S = new long[ M+1 ]; 
		st = new StringTokenizer(bf.readLine());
		for (int i = 1; i <= M; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(S[B] - S[A-1]);
		}
	}
}
