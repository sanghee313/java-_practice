package testPjt;

import java.io.*;

public class BoJ_2741 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			bw.write(i + "\n" );
		}
		
		bw.flush();
		bw.close();
		
		
	}

}
