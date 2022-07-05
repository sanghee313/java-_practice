package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908  {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A>B ? A:B);
	}
}
