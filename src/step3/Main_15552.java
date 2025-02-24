package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		int n = Integer.parseInt(bf.readLine());
		
		int[] nlist = new int[n];


		for(int i=0; i<n; i++) {
			String str = bf.readLine();
			int a = Integer.parseInt(str.split(" ")[0]);
			int b = Integer.parseInt(str.split(" ")[1]);

			bw.write((a+b)+"\n"); //str값 출력
		}
		
		bf.close();
		bw.flush();
		bw.close();
	}

}
