package step3;

import java.util.Scanner;

public class Main_8393 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //3
		int sum = 0;
		
		for(int i=0; i<=a; i++) {
			sum = sum + i; 
		}
		
		System.out.println(sum);
	}

}
