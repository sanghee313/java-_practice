package testPjt;

import java.util.Scanner;

public class Boj_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < (count - i); j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}			
			System.out.print("\n");
		}
		sc.close();
	}

}
