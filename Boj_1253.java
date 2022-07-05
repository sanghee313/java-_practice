package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1253 {
	public static void main(String[] args) throws IOException{
		/* �Է°� 1�� => �Է��� ���� ���Ѵ�. ex)10 �Է�*/
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //�Է°� 10 �Է�
		
		/* �Է°� 2�� => 1���� ����ŭ �Է� �Ѵ�. ex)[1,2,3,4,5,6,7,8,9,10]�Է� */
		StringTokenizer st = new StringTokenizer(bf.readLine()); //�ι�°�� �� : 1 2 3 4 5 6 7 8 9 10
		Long[] A = new Long[N]; 
		for (int i = 0; i < N; i++) { //Long �迭 [1,2,3,4,5,6,8,10,9,7]... �Էµ�.
			A[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(A); /* A�� ���� �������ش�!!=> [1,2,3,4,5,6,7,8,9,10] */
		
		/*���� �ǹ�
		 * ���� �� �� �߿��� ex)[1,2,3,4,5,6,7,8,9,10]
		 * �μ��� ���� ǥ���Ǵ� ���� ������ count �Ѵ�. ex) 3= 2+1 => count++ */
		int count =0;
		
		for (int i = 0; i < N; i++) {
			int start_p = 0; //�迭�� ���۰� (���� ������)
			int final_p = N-1; //�迭�� ���� ( �� ������ )
			long find = A[i]; // ex) find = 2+1 ���� ã�°�

			/* 1. (�ݺ���)���� �����Ϳ� ������ ������ �� �������� ����
			 * 2. A[���� ������]+A[������ ������] = A[i]�̸� count++�� ����
			 * 3. A[���� ������]+A[������ ������] < A[i]�̸� ���� ������ ����
			 * 4. A[���� ������]+A[������ ������] > A[i]�̸� ������ ������ ����*/
			while(start_p< final_p) {
				if (A[start_p]+A[final_p] == find) {
					//�迭�� ��ġ�� �������� ��ġ�� ������ �ȵȴ�. 
					if(start_p !=i && final_p!=i) {
						count++;
						break;
					}
					else if (start_p == i) {
						start_p++;
					}
					else {
						final_p--;
					}
						
				} else if (A[start_p]+A[final_p] < find) {
					start_p++;
				}else {
					final_p--;
				}
			}
		}
		System.out.println(count);
		
	}

}
