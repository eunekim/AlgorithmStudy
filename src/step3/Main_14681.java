package step3;

import java.util.Scanner;

public class Main_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
		 
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 
		 if (a > 0) {
			 if (b > 0) {
				 System.out.print(1);
			 } else {
				 System.out.print(4);
			 }
		 } else { 
			 if (b > 0) {
				 System.out.print(2);
			 } else {
				 System.out.print(3);
			 }
			
	     }

	}

}
