package step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //472
		int b = scan.nextInt(); //385
		
		int c = (b % 10) * a;
		int d = ((b % 100) / 10) * a;
		int e  = (b / 100) * a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a*b);

	}

}
