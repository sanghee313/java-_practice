package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2675 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//���� ���� 
		int A = Integer.parseInt(bf.readLine());
		
		//�ݺ� Ƚ�� 
		int R;
		//������ �迭
		String[] str;
		//������ �迭
		String S;
		
 		for (int i = 0; i < A; i++) {
 			//ex) 2 abc �Է�
 			str = bf.readLine().split(" ");
			//str[0] = 2, str[1] =abc ���� ���Ե� 
			R = Integer.parseInt(str[0]); //���� 2 ���� 
			S = str[1];      //���� str�� ���� ��.
			
			int cnt = S.length();
			for (int j = 0; j < cnt; j++) {
				for (int j2 = 0; j2 < R; j2++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
