package testPjt;

import java.io.*;

public class Boj_2742 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�ý��� �Է� 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//�ý��� ���
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			bw.write(num-i + "\n");
		}
		
		bw.flush();
		bw.close();	
	}

}
