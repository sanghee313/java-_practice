package testPjt;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // �Է��� ���ڸ� �д´�.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // ��� �� �ý��� ���� ��� 
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(a +b +"\n");
			
		}
		
		bw.flush(); // �ѹ��� ��� 
		bw.close();
		
		
		
	}

}
