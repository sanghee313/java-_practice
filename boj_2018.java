package testPjt;

import java.util.Scanner;

public class boj_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start_index = 1;
		int end_index = 1;
		int count = 1;
		int sum =1;
		
		int num = sc.nextInt();
		//�Է� ���� 15��� ���� 
		
		while(end_index != num) { //end_index == 15�� �Ǹ� ����
			
			if (sum < num) {
				// �հ谡 ���ϴ� ��(15) ���� ������ end_index ���� �̵��� �Ѵ�. => sum �� ���� �߰��� ���Ѵ�. 
				end_index++;
				sum = sum + end_index;
				
			} else if(sum > num) {
				//�հ谡 ���ϴ� �� (15) ���� ũ�� start_index ���� �̵��� �Ѵ�. => sum ������ start_index ���� ����. 
				sum = sum - start_index;
				start_index++;
			} else { // [ sum == num ]�϶� 
				count++;
				end_index++;
				sum = sum + end_index;
			}
		}
		
		System.out.println(count);	
	}
}
