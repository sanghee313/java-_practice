package testPjt;

import java.util.Scanner;

public class Boj_11021_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //�ý��� �Է� �ν�
		int count = in.nextInt(); // ī��Ʈ ���� ���� int ������..
		
		// count �� ��ŭ ���� ���� ����� (A + B)
		for (int i = 0; i < count; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			//ȣ��
			System.out.printf("Case #%d: %d + %d = %d\n",i+1,A,B,A+B);
			
		} 
		in.close();
		
	}

}
