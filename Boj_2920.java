package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2920 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] S = new int [8];
		
		for (int i = 0; i < 8; i++) {
			S[i] = Integer.parseInt(st.nextToken()); 
		}
		int[] arrA = {1,2,3,4,5,6,7,8};
		int[] arrD = {8,7,6,5,4,3,2,1};

		if(Arrays.equals(S, arrA)) {
			System.out.println("ascending");
		} else if(Arrays.equals(S, arrD)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
