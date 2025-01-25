package assigement_nptel_java;

import java.util.Scanner;

public class assigement_week1_5 {
	public static void main (String [] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("please enter the value of n");
			int n = sc.nextInt();
			for ( int i=n; i>0; i--) {
				for (int j=i; j>0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i=2; i<=n; i++) {
				for (int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}

}
