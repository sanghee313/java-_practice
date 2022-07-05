package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String Message = bf.readLine(); 
		Message = Message.toUpperCase();
		
		int[] A =new int[26];
		
		char[] Alpha = Message.toCharArray();
		
		for (int i = 0; i < Alpha.length; i++) {
			int value = Alpha[i]-'A' ;
			A[value] += 1;
		}		
		int max = A[0];
		int remember =0;
		for (int i = 0; i < A.length; i++) {
			if(max<A[i]) {
				max = A[i];
				remember = i;
			}
		}
		int count =0;
		for (int i = 0; i < A.length; i++) {
			if(max ==A[i]) {
				count++;
			}
		}
		if(count ==1 ) {
			System.out.println((char)(remember+65) );
		} else {
			System.out.println("?");
		}
		
		
	}

}
