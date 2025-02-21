package step3;

import java.util.Scanner;

public class Main_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] nlist = new int[a];
		
		for(int i=0; i<a; i++) {
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			nlist[i] = n1 + n2;
		}
		scan.close();
		
		for(int i=0; i<a; i++) {
			System.out.println(nlist[i]);
		}

	}

}
