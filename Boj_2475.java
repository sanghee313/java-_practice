package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] a =new int[st.countTokens()];
		int count =0;
		
		while(st.hasMoreTokens()) {
			a[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]*a[i];
		}
		System.out.println(sum%10);
		
	}
}
