package testPjt;

import java.util.Iterator;
import java.util.Scanner;

public class Boj_3052 {
	public static void main(String[] args) {
		
		//첫	번째 열부터 10번째 열까지 입력을 받는다. 
		int[] arr = new int[10];
		int temp = 0;
		int count =0;
		
		//입력값을 받는다.
		Scanner sc =new	Scanner(System.in);
		
		//arr[i]에 입력 값을 저장한다.
		for(int i=0; i < 10; i++) {
			arr[i]=sc.nextInt();
		}
		
		//42로 나눈 값을 저장한다.
		int[] arr2 = new int[10];
		for(int j=0; j < 10; j++) {
			int k =arr[j] % 42;
			arr2[j] = k;
		}
				
		//1~10 까지 반복문 	
		for (int i = 0; i < 10; i++) {
			temp = 0;
			/*유일하게 한개인 것은 count++한다.
			 * 여려가지 겹칠때는 마지막에 count++한다*/
			for (int j = i+1; j < 10; j++) {				
				if(arr2[i] == arr2[j] ) {
					temp++;
				}
			}
			if(temp == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
