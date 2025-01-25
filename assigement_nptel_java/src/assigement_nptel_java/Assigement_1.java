package assigement_nptel_java;

import java.util.Scanner;

public class Assigement_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("please submit your number please");
		int number;
		number = sc.nextInt();
		if (number%2==0)
			System.out.println("Even");
		else
			System.out.println("Old");
		sc.close();

	}

}
