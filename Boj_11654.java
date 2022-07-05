package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11654 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String A = bf.readLine();
		char B = A.charAt(0);
		int num = (int)B;
		System.out.println(num);
	}
}
