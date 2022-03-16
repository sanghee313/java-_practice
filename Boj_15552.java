package testPjt;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력한 숫자를 읽는다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력 값 시스탬 내부 출력 
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(a +b +"\n");
			
		}
		
		bw.flush(); // 한번에 출력 
		bw.close();
		
		
		
	}

}
