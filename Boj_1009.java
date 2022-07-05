package testPjt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.*;

public class Boj_1009 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =  Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb =  new StringBuilder();
		//T값 만큼 for문 반복 
		for (int i = 0; i < T ; i++) {
			st =  new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			
			int gob =1;
			for (int j=0; j < b ; j++) {
				gob =(a*gob)%10;
			}
			if (gob == 0) {
				gob = 10;
			}
			sb.append(gob).append('\n');	
		}
		System.out.println(sb);
		br.close();
	}

}
