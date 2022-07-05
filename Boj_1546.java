package testPjt;

import java.util.Scanner;
	/*
	 * N(a,b,c.....,z)
	 * ####(a+b+c)/M/N
	 * */
public class Boj_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //���� �Է�
		int[] A = new int[N]; //list ���� a,b,c.....
		
		for (int i = 0; i < N; i++) {
			A[i] =  sc.nextInt();
		} //a,b,c �Է�
		
		long sum = 0; //�� ������ ��
		long max = 0; //�ִ밪
		
		for (int i = 0; i < N ; i++) {
			
			if(A[i] > max) max = A[i]; 
			sum = sum + A[i];		
		}
		System.out.println(sum*100.0/max/N);
		sc.close();
	}

}
