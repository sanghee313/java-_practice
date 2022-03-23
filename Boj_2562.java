package testPjt;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2562 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[] arr = new int[9];
		int max = 1;
		
		//arr °ª ÀÔ·Â --> arr[0,1,2,3,4,5,6,7,8]
		for (int i = 0; i < 9; i++) {	
			arr[i] = in.nextInt();
			if (max <arr[i]) {
				max = arr[i];
			}
		}
		in.close();

		for (int j = 0; j < 9; j++) {	
			if(max == arr[j]) {
				System.out.println(arr[j]);
				System.out.println(j+1);
			}
		} 
	
		
			
	}
}
