package testPjt;

import java.util.Iterator;
import java.util.Scanner;

public class Boj_3052 {
	public static void main(String[] args) {
		
		//ù	��° ������ 10��° ������ �Է��� �޴´�. 
		int[] arr = new int[10];
		int temp = 0;
		int count =0;
		
		//�Է°��� �޴´�.
		Scanner sc =new	Scanner(System.in);
		
		//arr[i]�� �Է� ���� �����Ѵ�.
		for(int i=0; i < 10; i++) {
			arr[i]=sc.nextInt();
		}
		
		//42�� ���� ���� �����Ѵ�.
		int[] arr2 = new int[10];
		for(int j=0; j < 10; j++) {
			int k =arr[j] % 42;
			arr2[j] = k;
		}
				
		//1~10 ���� �ݺ��� 	
		for (int i = 0; i < 10; i++) {
			temp = 0;
			/*�����ϰ� �Ѱ��� ���� count++�Ѵ�.
			 * �������� ��ĥ���� �������� count++�Ѵ�*/
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
