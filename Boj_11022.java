package testPjt;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			StringTokenizer ST = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(ST.nextToken()); //String to Number 글자를 숫자로 치환
			int B = Integer.parseInt(ST.nextToken());	
			
			bw.write("Case #" +(i+1)+": "+A+" + "+B+" = "+(A+B)+"\n");
		}

		
		bw.flush();
		bw.close();
		
 	}
}