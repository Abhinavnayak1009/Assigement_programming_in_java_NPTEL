package assigement_nptel_java;

import java.util.Scanner;

public class Assigement_week1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter the number");
		int number = sc.nextInt();
		for ( int i=1; i<=number ; i++) {
			System.out.println(number +" x "+ i + " = " + (number*i));
		}

	}

}
