package testPjt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String S = bf.readLine();
		/*-------------------------------------*/
		//���ڿ� char[] ���� �Է� 
		char[] MM = new char[S.length()];
		MM = S.toCharArray();
		
		
		/*-------------------------------------*/
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1 ;
		}		
		
		for (int i = 0; i < MM.length; i++) {
			//b�� ��� �Դٰ� ��������.
			//i ��°��  
			if(alphabet[(int)MM[i]-97] == -1){
				alphabet[(int)MM[i]-97]= i; 		
			}
		}
		/*-------------------------------------*/
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
		
		
		
		
	}
}
